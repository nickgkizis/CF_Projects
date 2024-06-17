package gr.aueb.cf.Finalized_Projects;

import java.util.Scanner;

public class CipherV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int encoder = 0;
        System.out.println("Give me the encoder: ");
        encoder = in.nextInt();
        System.out.println("Encoding: +"+encoder);

        char c;
        for(c = 'a'; c <= 'z'; ++c) {
//            System.out.println("i= " + ((char) c));
//            System.out.println("integer= " + (int)c);
            if ((c + encoder) <= 122) {
                int i = c + encoder;
                System.out.println((char)c  +" = "+ ((char) i));
                System.out.println("integer= " + (int)i);
            } else {
                int i = (c + (encoder-26));
                System.out.println((char)c + " = " + ((char) i));
                System.out.println("integer= " + (int)i);
            }
        }

        String word = "";
        System.out.println("give me a word and the encoder");
        word = in.next();
        String[] arrword = word.split("");
//
        for (int i =0;i<=arrword.length;i++){
            System.out.print(arrword[i]+" ");
//            ((int)arrword[i]) = arrword[i+encoder];


        }
//
    }
}
