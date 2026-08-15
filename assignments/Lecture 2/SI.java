import java.util.Scanner;

public class SI{
//     3. Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       System.out.println("Enter the Principal");
       double p = in.nextDouble();

       System.out.println("Enter the Rate");
        double r = in.nextDouble();

       System.out.println("Enter the Time");
        double t = in.nextDouble();

        double result = (p * r * t)/100;

        System.out.println("The Simple Interest = " + result);
    }

}