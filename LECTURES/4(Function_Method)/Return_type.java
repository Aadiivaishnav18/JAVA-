import java.util.Scanner;

public class Return_type {

    public static void main(String[] args) {
        // Taking as arrguments = the value that is passing in the calling method 
     int result = add(10,30);
     System.out.println("The Sum = " + result);
    }

    // Return_type : int ;

    static int add( int a , int b) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter 1 Number :");
        // int num1 = in.nextInt();
        // System.out.println("Enter 2 Number :");
        // int num2 = in.nextInt();

        // int add = num1 + num2;
        // return add;

        int sum = a + b ;
        return sum;
    }
}