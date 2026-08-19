import java.util.Scanner;

public class Armestrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 3 digit number to find weather it is Armestome: ");
        int num = in.nextInt();
        System.out.println(num + " is Armestrome Number: " + isArmestrome(num));

        for (int i = 100; i < 1000; i++) {
            if (isArmestrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmestrome(int num) {
        int sum = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }

        return sum == original;
    }

}