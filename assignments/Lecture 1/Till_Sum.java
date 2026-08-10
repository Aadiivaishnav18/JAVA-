import java.util.Scanner;

public class Till_Sum{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while(true){
        System.out.println("Enter the Number (or x to stop) :");
        String input = in.next();


            if (input.equalsIgnoreCase("x")) {
                break;
            }

            int num = Integer.parseInt(input);
            sum += num;

        }

  System.out.println("sum = " + sum);
    }
}