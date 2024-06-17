package gr.aueb.cf.Finalized_Projects;

import java.util.Scanner;
//97-122
public class CipherV3 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str_input = "";
        int action= 0;

        do {
            printMenu();
            action = in.nextInt();
            System.out.println("Input word: ");
            in.nextLine();                                      // Consume the newline
            str_input = in.nextLine();

            switch (action) {
                case 1:
                    System.out.println("Input encoder: ");
                    int num = in.nextInt();
                    System.out.println("Encoding...");
                    System.out.println(encode(str_input,num));
                    break;
                case 2:
                    System.out.println("Input decoder: ");
                    num = in.nextInt();
                    System.out.println("Decoding...");
                    System.out.println(decode(str_input,num));
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (action != 3);

    }
    public static String encode(String inpt, int num) {
        StringBuilder encoded = new StringBuilder();
        for (char c : inpt.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                char newChar = (char) (c + num);
                if (newChar > 'z') {
                    newChar = (char) (newChar - 26); // wrap around if it exceeds 'z'
                }
                encoded.append(newChar);
            }
            else if (c >= 'A' && c <= 'Z') {
                char newChar = (char) (c + num);
                if (newChar > 'Z') {
                    newChar = (char) (newChar - 26); // wrap around if it exceeds 'z'
                }
                encoded.append(newChar);
            }
            else{
                encoded.append(c);
            }
        }
        return encoded.toString();
    }

    public static String decode(String inpt, int num) {
        StringBuilder decoded = new StringBuilder();
        for (char c : inpt.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                char newChar = (char) (c - num);     // normal flow
                if (newChar < 'a') {
                    newChar = (char) (newChar - 26); // wrap around if it exceeds 'z'
                }
                decoded.append(newChar);
            }
            else if (c >= 'A' && c <= 'Z') {
                char newChar = (char) (c - num);    // normal flow
                if (newChar < 'A') {
                    newChar = (char) (newChar - 26); // wrap around
                }
                decoded.append(newChar);
            }
            else{
                decoded.append(c);
            }
        }
        return decoded.toString();
    }

    public static void printMenu(){
        System.out.println("#".repeat(25));
        System.out.println("#       1. Encode.      #");
        System.out.println("#       2. Decode.      #");
        System.out.println("#       3. Exit.        #");
        System.out.println("#".repeat(25));
        System.out.print("=> ");
    }

}
