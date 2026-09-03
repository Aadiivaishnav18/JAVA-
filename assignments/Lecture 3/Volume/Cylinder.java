package Volume;

import java.util.Scanner;

public class Cylinder{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter radius: ");
        double radius = in.nextDouble();

        System.out.print("Enter height: ");
        double height = in.nextDouble();

        if(radius < 0 || height < 0){
            System.out.print("radius ,height cannot be Negative");
        }
        else{
            double Volume = Math.PI *Math.pow(radius, 2) * height;
            System.out.print("Volume of Cylinder: "+ Volume);
        }
    }
}