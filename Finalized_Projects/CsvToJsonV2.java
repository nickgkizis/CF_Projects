package gr.aueb.cf.Finalized_Projects.Finalized_Projects;

import java.io.*;
import java.util.regex.Pattern;

public class CsvToJsonV2 {
    public static void main(String[] args) throws IOException {

        // Get the current directory as a File object
        File currentDir = new File(System.getProperty("user.dir"));

        // Construct the input file path relative to the current directory
        String inputFileName = "locations.txt";
        File inputFile = new File(currentDir, inputFileName);
        String inputFilePath = inputFile.getAbsolutePath();

        // Construct the output file path relative to the current directory
        String outputFileName = "locations_output.txt";
        File outputFile = new File(currentDir, outputFileName);
        String outputFilePath = outputFile.getAbsolutePath();

        System.out.println("Absolute path of input file: " + inputFilePath);
        System.out.println("Absolute path of output file: " + outputFilePath);

        String line;

        try (BufferedReader bf = new BufferedReader(new FileReader(inputFilePath));
             PrintWriter pw = new PrintWriter(new FileWriter(outputFilePath))) {

            // Skip the first line (header)
            bf.readLine();
            Pattern doublePattern = Pattern.compile("-?\\d*\\.?\\d+");
            Pattern stringPattern = Pattern.compile("^[A-Za-z\\s\\-'.]+$");

            int i = 0;
            while ((line = bf.readLine()) != null) {
                String[] separatedcities = line.split(",");
                i++;
                if (separatedcities.length >= 3
                        && (separatedcities[0].trim()).matches(String.valueOf(stringPattern))
                        && (separatedcities[1].trim()).matches(String.valueOf(doublePattern))
                        && (separatedcities[2].trim()).matches(String.valueOf(doublePattern))) { // Ensure there are enough elements

                    pw.printf("(%02d) %s {location: %s, ",i,"\u2714\uFE0F",separatedcities[0]);
                    pw.printf("latitude: %s, ",separatedcities[1]);
                    pw.printf("longitude: %s}%n", separatedcities[2]);

                } else {
                    pw.printf("(%02d) %s %s%n", i, "\u274C", line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

