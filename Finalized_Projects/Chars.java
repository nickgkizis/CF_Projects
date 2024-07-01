package gr.aueb.cf.Finalized_Projects.Finalized_Projects;

import java.util.Arrays;
import java.util.Scanner;

public class Chars {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String s1 = getUserInput("String number 1: ");
        String s2 = getUserInput("String number 2: ");
        int num = getUserNum("Index number: ");

        System.out.println("s1> " + s1);
        System.out.println("s2> " + s2);
        System.out.println("-".repeat(20));
        System.out.println("Comparing:\ns1> " + s1 + "\nand\ns2> " + s2);
        compareStrings(s1, s2);
        System.out.println("-".repeat(20));
        printEachCharacter(s1);
        System.out.println("-".repeat(20));
        printEachCharacter(s2);
        System.out.println("-".repeat(20));
        System.out.println("Array: " + Arrays.toString(toCharArray(s1)));
        System.out.println("-".repeat(20));
        System.out.println("Array: " + Arrays.toString(toCharArray(s2)));
        System.out.println("-".repeat(20));
        System.out.println("Substring till index "+num+": " + substringTillNum(s1,num));
        System.out.println("-".repeat(20));
        System.out.println("Substring till index "+num+": " + substringTillNum(s2,num));
        System.out.println("-".repeat(20));
    }
    //Get the input from the user (2 strings and 1 number)
    public static String getUserInput(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public static int getUserNum(String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }
    //compare the two
    public static void compareStrings(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal");
        }
    }

    // Print each character.
    public static void printEachCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static char[] toCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static String substringTillNum(String str, int num) {
        if (str.length() >= num) {
            return str.substring(0, num);
        } else {
            return str; // Return the whole string if it's shorter than the requested substring length
        }
    }
}
