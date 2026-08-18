import java.util.Scanner;

public class AreaTriangle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Base: ");
        double base = in.nextDouble();

        System.out.print("Enter the Height: ");
        double height = in.nextDouble();

        if (base > 0 && height > 0) {

            double area = 0.5 * base * height;

            System.out.println("The Area of Triangle: " + area);

        } else {

            System.out.println("Base and Height must be greater than 0.");

        }

        in.close();
    }
}