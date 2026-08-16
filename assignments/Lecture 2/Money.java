import java.util.Scanner;

public class Money{
    // . Input currency in rupees and output in USD.
    public static void main(String[] args) {
        
     Scanner in = new Scanner(System.in);

     System.out.print("Enter currency in Rupees: Rs=");
     double IndianRupess = in.nextDouble();
   
     double USD = IndianRupess * 0.01048;

     System.out.print("Curreny in USD: $="+USD);

    }
}