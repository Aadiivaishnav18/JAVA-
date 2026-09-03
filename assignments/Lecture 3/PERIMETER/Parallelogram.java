package PERIMETER;

import java.util.Scanner;

public class Parallelogram {

   public static void main(String[] args) {
    
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the Adjecent sides a ,b : ");

      double a = in.nextDouble();
      double b = in.nextDouble();

if (a <= 0 || b <= 0) {
    System.out.println("Sides must be greater than 0.");
} else {
    double perimeter = 2 * (a + b);
    System.out.println("The Perimeter of Parallelogram: " + perimeter);
}


     

   }

} 