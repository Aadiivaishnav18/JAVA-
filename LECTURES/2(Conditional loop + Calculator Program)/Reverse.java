import java.util.Scanner;

public class Reverse{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to Reverse :");

        int num = in.nextInt();
        int ans = 0;

        while( num > 0 ){

            int rem = num % 100;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println("The Reverse Number :" + ans);
    }
}