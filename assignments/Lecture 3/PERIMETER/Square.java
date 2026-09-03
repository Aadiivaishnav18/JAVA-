package PERIMETER;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Side of Square: ");
        double Side = in.nextDouble();

        if(Side < 0){
            System.out.print("Side Cannot be Negative");
        }
        else{

            double Perimeter = 4 * Side;

            System.out.println("Perimeter of Square: " + Perimeter);
        }

    }
}