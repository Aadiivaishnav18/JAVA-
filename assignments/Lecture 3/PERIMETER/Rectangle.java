package PERIMETER;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the Length: ");
        double Length = in.nextDouble();

        System.out.println("Enter the Breath: ");
        double Breath = in.nextDouble();

        if(Length < 0 || Breath < 0){
            System.out.println("Length and Breath Cannot Negative ");
            
        }
       else{

       double Perimeter = 2 * (Length * Breath);
       System.out.println("The Perimeter of Rectangle: " + Perimeter );
       }

    }



     
}