package AREA;

import java.util.Scanner;

public class EquilateralTriangle {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side of Triangle: ");
        double side = in.nextDouble();

        if(side>0){
            double Area = ((Math.sqrt(3))/4)* Math.pow(side,2);
            System.out.printf("Area of Equilateral Triangle: %.2f%n", Area);
        }
        else{
            System.out.print("Side Cannot be Negative");
        }
    in.close();
    }
}
