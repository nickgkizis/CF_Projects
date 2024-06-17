package gr.aueb.cf.Finalized_Projects;

import java.io.IOException;
import java.util.Scanner;

public class StarsV3 {
    static Scanner in = new Scanner(System.in) ;

    public static void main(String[] args) throws IOException {
        int choice;

        do {
            printMenu();
            choice = user_input_a();

            switch (choice) {
                case 1:
                    System.out.println("(1. Εμφάνισε n αστεράκια οριζόντια.)");
                    horizontal();
                    break;
                case 2:
                    System.out.println("(2. Εμφάνισε n αστεράκια κάθετα.)");
                    vertical();
                    break;
                case 3:
                    System.out.println("(3. Εμφάνισε n γραμμές με n αστεράκια.)");
                    horizontalLines();
                    break;
                case 4:
                    System.out.println("(4. Εμφάνισε n γραμμές με αστεράκια 1 – n.)");
                    increasingStars();
                    break;
                case 5:
                    System.out.println("(5. Εμφάνισε n γραμμές με αστεράκια n – 1.)");
                    decreasingStars();
                    break;
                case 6:
                    System.out.println("(6. Έξοδος από το πρόγραμμα.)");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
    public static int user_input_a() throws IOException{
        System.out.print("Επιλογή πράξης (1-6): ");
        return in.nextInt();
    }
    public static int user_input_b() throws IOException{
        System.out.print("Επιλογή μεταβλητής (n): ");
        return in.nextInt();
    }
    public static void printMenu(){
        System.out.println("#".repeat(50));
        System.out.println(
                "\n1. Εμφάνισε n αστεράκια οριζόντια\n" +
                "2. Εμφάνισε n αστεράκια κάθετα\n" +
                "3. Εμφάνισε n γραμμές με n αστεράκια\n" +
                "4. Εμφάνισε n γραμμές με αστεράκια 1 – n\n" +
                "5. Εμφάνισε n γραμμές με αστεράκια n – 1\n" +
                "6. Έξοδος από το πρόγραμμα\n");
        System.out.println("#".repeat(50));
    }
    public static void horizontal() throws IOException{
        int a = user_input_b();
        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void vertical() throws IOException{
        int a = user_input_b();
        for (int i = 1; i <= a; i++) {
            System.out.println("*");
        }
    }
    public static void horizontalLines() throws IOException{
        int a = user_input_b();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("  *");
            }
            System.out.println();
        }
    }
    public static void increasingStars() throws IOException{
        int a = user_input_b();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void decreasingStars() throws IOException{
        int a = user_input_b();
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
