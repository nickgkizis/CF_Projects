package gr.aueb.cf.Finalized_Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
The first version of the tokenizer uses
regular expressions and lists in order to
clean and split the text.
The output is a list of tokens that will
be printed in the console.
 */
public class TokenizerV1 {
    public static void main(String[] args) {
        File fd = new File("C:/test1.txt");
        List<String> tokensList = new ArrayList<>();

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                // Split using regex to match any whitespace
                // Whitespace is considered: \f\n\r\t\s
                String[] tokens = line.split("\\s+");


                for (String token : tokens) {
                    // Strip and remove unwanted characters in one step
                    token = token.replaceAll("[.,():;\"'`’!?]", "").strip();
                    if (!token.isEmpty()) {
                        tokensList.add(token);
                    }
                }
            }

            // Print tokens from the list
            for (String token : tokensList) {
                System.out.println(token);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fd.getAbsolutePath());
        }
    }
}
