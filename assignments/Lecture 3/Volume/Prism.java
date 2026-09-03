package Volume;

import java.util.Scanner;

public class Prism {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        double Length = in.nextDouble();

        System.out.print("Enter the Breath: ");
        double Breath = in.nextDouble();

        System.out.print("Enter the Height: ");
        double Height = in.nextDouble();

        if( Length < 0 || Breath < 0 || Height < 0 ){

            System.out.println("Invalid ");

        }

        else{

            double BaseArea = Length * Breath;
            
            double Volume = BaseArea * Height;

            System.out.print("Volume of Prism: " + Volume);
        }


    }
}