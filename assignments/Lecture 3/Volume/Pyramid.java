package Volume;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter base side: ");
        double side = in.nextDouble();

        System.out.print("Enter height: ");
        double height = in.nextDouble();

        if (side <= 0 || height <= 0) {
            System.out.println("Side and Height must be greater than 0.");
        } else {

            double volume = (side * side * height) / 3;

            System.out.println("Volume of Pyramid: " + volume);
        }

        in.close();
    }
}