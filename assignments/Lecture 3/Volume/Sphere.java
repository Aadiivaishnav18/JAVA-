package Volume;

import java.util.Scanner;

public class Sphere {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = in.nextDouble();

        if (radius <= 0) {
            System.out.println("Radius must be greater than 0.");
        } else {

            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

            System.out.println("Volume of Sphere: " + volume);
        }

        in.close();
    }
}