package gr.aueb.cf.Finalized_Projects;

import java.util.Scanner;

public class StarsV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("give me the height");
        int ipsos = in.nextInt();
        System.out.println("give me the length");
        int platos = in.nextInt();

        for (int i = ipsos;i>=1;i--){
//            System.out.println("i = "+i);
//            System.out.println("----------");
            for (int x=1;x<=platos;x++){
//                System.out.println("x = "+x);
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}
