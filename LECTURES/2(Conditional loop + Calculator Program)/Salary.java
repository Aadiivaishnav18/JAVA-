import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Salary :");

        int salary = input.nextInt();
        int bonus = 2000;

        if (salary >= 10000) {
            salary = salary + bonus;
        } else {
            salary = salary + 1000;
        }
        System.out.println("Your In Hand salary and bonus" );
        System.out.println(salary);
    }
}