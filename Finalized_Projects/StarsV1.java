package gr.aueb.cf.Finalized_Projects.Finalized_Projects;

import java.util.Scanner;

public class StarsV1 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("______________");
        System.out.println();

        for (int i=0;i<=10;i++){
            for (int x=0;x<=i;x++){
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("______________");
        System.out.println();

        for (int i=10;i>=0;i--){
            for (int x=0;x<=i;x++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("______________");
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Give me the start and the ending numbers");
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println();
        System.out.println("______________");
        System.out.println();

        for (int i=1;i<=end;i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("______________");
        System.out.println();

        for (int i=start;i!=0;i--) {
            System.out.println("*");
        }

        System.out.println();
        System.out.println("______________");
        System.out.println();

        for (int i=0;i!=end;i++){
            for (int x=0;x<=i;x++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("______________");
        System.out.println();

        for (int i=start-1;i>=0;i--){
            for (int x=0;x<=i;x++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("______________");
        System.out.println();

         int height = start;
         int length = end;

        for (int i = height;i>=1;i--){
            for (int x=1;x<=length;x++){
                System.out.print("  *");
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("dimensions are: %d x %d",height,length);

        System.out.println();
        System.out.println("______________");
        System.out.println();
    }
}
