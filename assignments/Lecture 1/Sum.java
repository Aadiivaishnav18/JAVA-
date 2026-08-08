import java.util.Scanner;

public class Sum{

    // Q2.Take two numbers and print the sum of both.
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter First Number :");
    int num1 = in.nextInt();

    System.out.print("Enter Second Number :");
    int num2 = in.nextInt();

    int sum = num1 + num2 ;
    System.out.println("The Sum = " + sum);

    }
}