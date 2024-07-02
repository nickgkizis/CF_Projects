package gr.aueb.cf.Finalized_Projects;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Press 'y' to roll the dice, or 'n' to exit the app.");
        String answer = in.nextLine();

        boolean exit = false;

        while (exit==false) {
            if (answer.equalsIgnoreCase("y")) {
                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                System.out.printf("[%d][%d]\n",die1,die2);
                System.out.println("'y' to re-roll\n'n' to exit.");
                answer = in.nextLine();
            }
            else if (answer.equalsIgnoreCase("n")) {
                exit = true;
                System.out.println("Exiting...");
            }
            else{
                System.out.println("Error! Please give me 'y' or 'n'.");
                answer = in.nextLine();
            }
        }
    }
}
