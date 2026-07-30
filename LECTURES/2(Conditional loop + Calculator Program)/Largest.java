import java.util.Scanner;

public class Largest {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = in.nextInt();

        System.out.println("Enter the Second Number");
        int b = in.nextInt();

        System.out.println("Enter the Third Number");
        int c = in.nextInt();

        // 1). Method by using the else If //

        // if (a > b && a > c) {
        // System.out.println(a + " is the greater number");
        // } else if (b > a && b > c) {
        // System.out.println(b + " is the greater number");
        // } else {
        // System.out.println(c + " is the greater number");
        // }



        // 2). Method by using the max variable
        // int max = a ;
        // if(a > b){
        // System.out.println(a);

        // }else{
        // System.out.println(b);
        // }
        // if(c > max){
        // System.out.println(c);
        // }

        //3). The Most attractive method using the Math.max() this is usefull for the 2 or 3 numbers ;//

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max + " is the Greater number ");

      // 4) For to find largest among the n Number \
        //   so use the for loop 
    // System.out.print("How many numbers do you want to enter? ");
    //     int n = in.nextInt();

    //     System.out.print("Enter the first number: ");
    //     int max = in.nextInt();

    //     for (int i = 2; i <= n; i++) {
    //         System.out.print("Enter number " + i + ": ");
    //         int num = in.nextInt();

    //         if (num > max) {
    //             max = num;
    //         }
    //     }

    //     System.out.println("The Greatest Number is: " + max);

    //     in.close();
    }
}