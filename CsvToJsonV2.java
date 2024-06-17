package gr.aueb.cf.Finalized_Projects;

import java.io.*;
import java.util.regex.Pattern;

public class CsvToJsonV2 {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:/Users/nickg/OneDrive/Desktop/locations.txt";
        String outputFilePath = "C:/Users/nickg/OneDrive/Desktop/locations_output.txt";

        String line;

        try (BufferedReader bf = new BufferedReader(new FileReader(inputFilePath));
             PrintWriter pw = new PrintWriter(new FileWriter(outputFilePath))) {

            // Skip the first line (header)
            bf.readLine();
            Pattern doublePattern = Pattern.compile("\\d+\\.\\d+");
            Pattern stringPattern = Pattern.compile("[a-zA-Z]+");

            int i = 0;
            while ((line = bf.readLine()) != null) {
                String[] separatedcities = line.split(",");
                i++;
                if (separatedcities.length >= 3
                        && separatedcities[0].matches(String.valueOf(stringPattern))
                        && separatedcities[1].matches(String.valueOf(doublePattern))
                        && separatedcities[2].matches(String.valueOf(doublePattern))) { // Ensure there are enough elements

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

