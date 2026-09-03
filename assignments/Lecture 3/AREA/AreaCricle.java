import java.util.Scanner;

public class AreaCricle{
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int radius = in.nextInt();


        if(radius > 0){
                    // Use the Math.pi(3.14)
        double Area = Math.PI * radius*radius; 
        System.out.println("The Area of Circle: " + Area);
        }
        else{
                System.out.println("The Radius Cannot be Negative" );
        }


    }
}