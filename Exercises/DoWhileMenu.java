package gr.aueb.cf.Finalized_Projects;

import java.util.Scanner;

public class DoWhileMenu {
    public static void main(String[] args) {
        int choice = 0;
        Scanner in = new Scanner(System.in);

       do {
           System.out.println("\n\n1. Εισαγωγή \n2. Διαγραφή \n3. Ενημέρωση \n4. Αναζήτηση \n5. Έξοδος\n\n");
           choice = in.nextInt();
           if (choice == 1) {
               System.out.println("1.Successful");
           }
           else if (choice == 2){
               System.out.println("2.Successful");
           }
           else if (choice == 3) {
               System.out.println("3.Successful");
           }
           else if (choice == 4){
               System.out.println("4.Successful");
           }
           else if (choice == 5) {
               System.out.println("5.Exiting.");
           }
           else {
               System.out.println("Error.");
           }
       }while (choice!=5);
    }
}
