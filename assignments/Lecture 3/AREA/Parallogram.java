import java.util.Scanner;

public class Parallogram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Base :");
        double base = in.nextDouble();
        System.out.print("Enter the Height :");
        double height = in.nextDouble();

        if(base>0 && height>0){
            double Area = (base * height);

            System.out.println("Area of Parallogarm: " + Area);
        }
        else {
            System.out.println("Base and Height always be Positive");
        }
    }
}
