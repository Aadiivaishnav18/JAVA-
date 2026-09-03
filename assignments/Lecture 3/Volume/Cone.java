package Volume;

import java.util.Scanner;

public class Cone {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = in.nextDouble();

        System.out.print("Enter height: ");
        double height = in.nextDouble();

        if(radius < 0 || height < 0 ){

            System.out.print("Radius or Height Cannot be Negative");
        }
      else{

        double Volume = (Math.PI  * height * radius * radius) / 3 ;

        System.out.print("Volume of Cone: " + Volume);
      }
     }

}