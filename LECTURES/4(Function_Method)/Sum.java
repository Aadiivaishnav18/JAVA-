import java.util.Scanner;

public class Sum {

    // Method are the block of code that perform a Specific Task
    // Syntax :
    // accessmodifiers static returntype Methodname(parameters){
    // code
    // }

    // Types of Methods:
    // 1) No Arrguments and Parameters

    public static void main(String[] args) {
        sum();

    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("The Sum = " + sum);

    }

}