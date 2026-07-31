import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");

        int n = in.nextInt();

        int a = 0;
        int b = 1;

      if(n>=1){
        System.out.print(a + " ");
      }

      if (n >= 2){
        System.out.print(b + " ");
      }
    
        for(int i =3 ; i <= n; i++) {

            int temp = b;
            b = a + b;
            a = temp;

              System.out.print(b + " ");
        }

      
    }
}