import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lcm = 1;
        int max = Math.max(a, b);

        while (true) {
            if (max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            max++;
        }

        System.out.println("LCM = " + lcm);
    }
}
