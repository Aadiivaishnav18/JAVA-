import java.util.Scanner;

public class Isosceles{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Base: ");
        double base = in.nextDouble();
        System.out.print("Ente the Side :");
        double side = in.nextDouble();

        double height =(Math.sqrt(side * side  -(base * base )/4));

        if(base > 0 && height > 0){
            double Area = (0.5 * base * height);

            System.out.println("Area of Isosceles Triangle: " + Area);
        }
        else{
            System.out.println("Base and Height always be Positive");
        }


    }
}