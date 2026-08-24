package PERIMETER;

import java.util.Scanner;

public class EquilateralTriangle{

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.print("Enter the Side: ");

        double Side = in.nextDouble();

        if(Side > 0 ){

            double Perimeter = (3 *Side);
          System.out.println("Perimeter of Equilateral Triangle: 3 *Side ");
            System.out.printf("Perimeter of Equilateral Triangle: %.2f%n", Perimeter);
        }
       else{
        System.out.println("Side Cannot be Negative ");
       }
     
       in.close();

    }
}