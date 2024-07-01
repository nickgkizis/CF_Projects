package gr.aueb.cf.Finalized_Projects.Finalized_Projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvToJsonV1 {
    public static void main(String[] args) throws IOException {
        String line;
        String[] linecities;
        String[] separatedcities;
        try (BufferedReader bf = new BufferedReader(new FileReader("locations.txt"))) {
            while ((line = bf.readLine()) != null){
                linecities = line.split("\n");
                for (int i = 0; i < linecities.length;i++){
//                    System.out.println(linecities[i]);
                    separatedcities = linecities[i].split(",");
                    System.out.print("{location: "+separatedcities[i]);
                    System.out.print(", latitude: "+separatedcities[i+1]);
                    System.out.print(", longitude: "+separatedcities[i+2]+"}");
                    System.out.println();
                }
            }
        }
    }
}