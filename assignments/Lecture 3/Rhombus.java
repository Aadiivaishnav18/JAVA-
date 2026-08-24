import java.util.Scanner;

public class Rhombus{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Diagonal1: ");
        double D1 = in.nextDouble();

        System.out.print("Enter the Diagonal2: ");
        double D2 = in.nextDouble();

        if(D1 > 0 && D2 > 0){
            double Area = (0.5 * D1 * D2);

            System.out.printf("Area of Rhombus: %.2f%n", Area);
        }

        else{
            System.out.println("Diagnol's cannot be Negative");
        }
        in.close();
    }
}