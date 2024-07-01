package gr.aueb.cf.Finalized_Projects;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        float f=0;
        float c=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Temperature in Fahrenheit: ");
        f=in.nextInt();

        c = 5*(f-32)/9;
        System.out.println(f+" degrees Fahrenheit <=> "+c+" degrees Celsius");
    }
}
