import java.util.Scanner;

public class Largest {

    // 5. Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        int Max = Math.max(num1, num2);
        System.out.print("The Largest Number is: " + Max);
    }

}