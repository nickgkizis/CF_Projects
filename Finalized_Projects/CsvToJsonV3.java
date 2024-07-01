package gr.aueb.cf.Finalized_Projects.Finalized_Projects;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvToJsonV3 {
    public static void main(String[] args) throws IOException {
        String line;
        try (BufferedReader bf = new BufferedReader(new FileReader("locations.txt"))) {
            // Skip the first line (header)
            bf.readLine();

            while ((line = bf.readLine()) != null) {
                String[] separatedcities = line.split(",");
                if (separatedcities.length >= 3) { // Ensure there are enough elements
                    System.out.print("{location: " + separatedcities[0]);
                    System.out.print(", latitude: " + separatedcities[1]);
                    System.out.print(", longitude: " + separatedcities[2] + "}");
                    System.out.println();
                } else {
                    System.out.println("Invalid line: " + line);
                }
            }
        }
    }
}
