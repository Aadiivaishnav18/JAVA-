import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Values :");
        int days = in.nextInt();
        // Prints Days //
        // switch (days) {
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("Tuesday");
        // case 3 -> System.out.println("Wednesday");
        // case 4 -> System.out.println("Thrusday");
        // case 5 -> System.out.println("Friday");
        // case 6 -> System.out.println("Saturday");
        // case 7 -> System.out.println("Sunday");

        // default -> System.out.println("Please Enter Valid Value ");

        // }

        // Prints Weekdays and Weekends //
        switch (days) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
            default -> System.out.println("Please Enter Valid Value ");

        }

    }
}