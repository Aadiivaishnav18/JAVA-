import java.util.Scanner;

public class Rectangle{
// Area of Rectangle
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        double Length = in.nextDouble();

        System.out.print("Enter the Breath");
        double Breath = in.nextDouble();


        if(Length > 0 && Breath >0){
        double Area = Length * Breath;
        System.out.println("Area of Rectangle: "+ Area);
        }
        else{
            System.out.println("Length and Breath must be positive" );
        }


    }
}