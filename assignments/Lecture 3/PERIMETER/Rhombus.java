package PERIMETER;

import java.util.Scanner;

public class Rhombus {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side of Rhombus:");

        double side = in.nextDouble();

        if (side <= 0) {
            System.out.println("Side must be greater than 0.");
        } else {
            double perimeter = 4 * side;

            System.out.println("The Perimeter of Rhombus: " + perimeter);
        }

        in.close();
    }
}