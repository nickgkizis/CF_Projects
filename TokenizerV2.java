package gr.aueb.cf.Finalized_Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
/*
The second version of the tokenizer uses
regular expressions and lists in order to
clean and split the text.
The output is a list of tokens that will
be added in a new file ("text_out.txt").
 */
public class TokenizerV2 {
    public static void main(String[] args) throws FileNotFoundException {
        File fd = new File("text_file.txt");
//        Map<Integer, List<String>> tokensMap = new TreeMap<>();
        Map<Integer, Set<String>> tokensMap = new TreeMap<>();
        PrintStream ps = new PrintStream(new FileOutputStream("text_out.txt"), true);
        System.out.println("How many letters; ");

        try (Scanner in2 = new Scanner(fd)) {
            int findAllTokens = -1; // Initialize findAllTokens with a default value

            try {
                Scanner in1 = new Scanner(System.in); // Assuming you want to read input from the user
                findAllTokens = in1.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please provide an integer!");
            }
            try (Scanner in = new Scanner(fd)) {
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    // Split using regex to match any whitespace
                    String[] tokens = line.split("\\s+");
                    // \f\n\r\t\s

                    for (String token : tokens) {
                        // Strip and remove unwanted characters in one step
                        token = token.replaceAll("[.,\\-():;\"'`΄’]", "").strip();
                        token = token.replaceAll("[\\d+]", "").strip();
                        token = token.toLowerCase();

                        if (!token.isEmpty() && token.length() == findAllTokens) {
                            int length = token.length();
                            // Get the list of tokens for this length, or create it if it doesn't exist
                            tokensMap.computeIfAbsent(length, k -> new HashSet<>()).add(token);
                        }
                    }
                }

                // Print tokens categorized by their length
                int final_count = 0;
                for (Map.Entry<Integer, Set<String>> entry : tokensMap.entrySet()) {
                    int counts = 0;
                    int length = entry.getKey();
                    Set<String> tokens = entry.getValue();
                    System.out.printf("Tokens with length %d:\n", length);
                    ps.printf("Tokens with length %d:\n", length);
                    for (String token : tokens) {
                        counts++;
                        final_count++;
                        System.out.println(token);
                        ps.println(token);
                    }
                    System.out.println("(" + counts + ")");
                    ps.println("(" + counts + ")");
                    System.out.println(); // Add an empty line between categories
                    ps.println();
                }
                System.out.println("Final tokens: " + "(" + final_count + ")");
                ps.println("Final tokens: " + "(" + final_count + ")");
//            ps.close();

            } catch (FileNotFoundException e) {
                System.err.println("File not found: " + fd.getAbsolutePath());
            }
        }
    }
}
