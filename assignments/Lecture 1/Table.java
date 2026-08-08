import java.util.Scanner;

public class Table{
    public static void main(String[] args) {
        //  Take a number as input and print the multiplication table for it.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number for its Multiplication Table :");
        int num = in.nextInt();
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(num + "*" + i + "=" + (num*i) );
        } 
    }
}