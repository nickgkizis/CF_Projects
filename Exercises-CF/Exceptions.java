package gr.aueb.cf.Finalized_Projects;

import java.util.Scanner;

public class Exceptions {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int user_input;

        do {
            printMenu();
            user_input = getUserInput();
            System.out.println("Checking input:");
            try{
                printChoice(user_input);
            }catch (IllegalArgumentException e){
//                e.printStackTrace();
                System.out.println("input has to be between 1 and 5!");
            }

            if (user_input == 1) {
                System.out.println("(1.)");
            }
            if (user_input == 2) {
                System.out.println("(2.)");
            }
            if (user_input == 3) {
                System.out.println("(3.)");
            }
            if (user_input == 4) {
                System.out.println("(4.)");
            }
            if (user_input == 5) {
                System.out.println("(5-exit.)");
            }
        } while (user_input != 5);

        in.close();

    }

    public static int getUserInput() {
        int inpt = 0;
        System.out.println("V Insert integer V");
            if (in.hasNextInt()) {
                inpt = in.nextInt();
            }else{
//                throw new InputMismatchException();
                System.out.println("not an integer!");
                in.nextLine();
            }
            return inpt;
        }


    public static void printMenu() {
        System.out.println("#".repeat(30));
        System.out.println(
                "\n1. choice 1\n" +
                        "2. choice 2\n" +
                        "3. choice 3\n" +
                        "4. choice 4\n" +
                        "5. choice 5 = exit.\n" );
        System.out.println("#".repeat(30));
    }

    public static void printChoice(int Choice){
        try {
            if (Choice < 1 || Choice > 5) throw new IllegalArgumentException();
        }catch (IllegalArgumentException e) {
//            e.printStackTrace();
            throw e;
        }
        System.out.println(Choice);
    }
}
