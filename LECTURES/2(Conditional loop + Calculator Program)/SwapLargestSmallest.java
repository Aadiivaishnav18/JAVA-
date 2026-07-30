import java.util.Scanner;

public class SwapLargestSmallest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        System.out.print("Enter third number: ");
        int c = in.nextInt();

        // Find largest
        int max = Math.max(a, Math.max(b, c));

        // Find smallest
        int min = Math.min(a, Math.min(b, c));

        // Swap largest and smallest
        if (a == max) {
            a = min;
        } else if (a == min) {
            a = max;
        }

        if (b == max) {
            b = min;
        } else if (b == min) {
            b = max;
        }

        if (c == max) {
            c = min;
        } else if (c == min) {
            c = max;
        }

        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Third number: " + c);

        in.close();
    }
}
