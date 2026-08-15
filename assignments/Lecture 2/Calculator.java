import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = in.nextInt();
 
        
        System.out.println("Enter the operator (+, -, *, /):");
        char operator = in.next().charAt(0);

        if(operator == '+'){
            System.out.println("Result= " + (num1+num2) );
        }

       else if(operator == '-'){
            System.out.println("Result= " + (num1-num2) );
        }

       else if(operator == '*'){
            System.out.println("Result= " + (num1*num2) );
        }


       else if(operator == '/'){
            System.out.println("Result= " + (num1/num2) );
        }
        else{
             System.out.println("Invaild Try Again ");
        }

   
    }
}