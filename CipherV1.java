package gr.aueb.cf.Finalized_Projects;

import java.util.Scanner;
/*
Based on the ASCII value of each character we can pivot the
alphabet forward by getting input from the user. This method
is a trivial cryptographic method in order to transfer a
message that is encoded using an encoder that the only recipient
knows, therefore can decrypt the message and get access to the
content of the message.
*/
public class CipherV1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int encoder;
        System.out.println("Give me the encoder: ");
        encoder = in.nextInt();
        in.nextLine(); // Consume newline left-over from nextInt()
        System.out.println("Encoding: +" + encoder);

        //Values for lowercase letters
        char c;
        for (c = 'a'; c <= 'z'; ++c) {
            if ((c + encoder) <= 'z') {
                int i = c + encoder;
                System.out.println(c + " = " + ((char) i));
                System.out.println("integer= " + i);
            } else {
                int i = (c + encoder - 26);
                System.out.println(c + " = " + ((char) i));
                System.out.println("integer= " + i);
            }
        }
        //Values for capital letters and reassignment based on
        for (c = 'A'; c <= 'Z'; ++c) {
            if ((c + encoder) <= 'Z') {
                int i = c + encoder;
                System.out.println(c + " = " + ((char) i));
                System.out.println("integer= " + i);
            } else {
                int i = (c + encoder - 26);
                System.out.println(c + " = " + ((char) i));
                System.out.println("integer= " + i);
            }
        }
    }
}
