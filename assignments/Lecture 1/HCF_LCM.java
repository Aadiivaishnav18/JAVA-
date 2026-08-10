import java.util.Scanner;

public class HCF_LCM {
    // Take 2 numbers as inputs and find their HCF and LCM.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = in.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = in.nextInt();

        int x = num1;
        int y = num2;

        // HCF
        while (y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }

        int hcf = x;

        // LCM
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF=" + hcf);
        System.out.println("LCM=" + lcm);

    }

}
