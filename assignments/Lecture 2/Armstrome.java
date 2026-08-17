import java.util.Scanner;

public class Armstrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = in.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }

        if(original == sum){
            System.out.println("This is Armstrome");
        }
        else{
            System.out.println("This is not Armstrome");
        }
    }

}