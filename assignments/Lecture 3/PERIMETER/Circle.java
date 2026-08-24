package PERIMETER;

import java.util.Scanner;

public class Circle{

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter the Radius: ");
        double Radius = in.nextDouble();

        if(Radius > 0){

            double Perimeter = (2 * Math.PI * Radius);
            System.out.printf("Perimeter of Circle: %.2f%n",Perimeter);
        }
        else{
            System.out.print("Radius cannot be Negative");
        }

     in.close();

        
    }
}