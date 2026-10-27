import java.util.Scanner;

public class Max_Min {

    static void Maximum(int a, int b, int c) {

        int Max = Math.max(c, (Math.max(a, b)));
        System.out.println(Max + " ");

    };

    static void Minimum(int a, int b, int c) {

        int Min = Math.min(c, (Math.min(a, b)));
        System.out.println(Min  + " ");

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Three Number");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        Maximum(a, b, c);
        Minimum(a, b, c);
    }

}