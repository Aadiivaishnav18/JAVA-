import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");

        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        // To Print the Fibonacci Series up to n terms

      // if(n>=1){
      //   System.out.print(a + " ");
      // }

      // if (n >= 2){
      //   System.out.print(b + " ");
      // }
    
      //   for(int i =3 ; i <= n; i++) {
while(count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            count ++;
         System.out.print(b);
}
     
        // }
    }
}