import java.util.Scanner;

public class Leap_year{
// Q 1. Input a year and find whether it is a leap year or not.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Year Weather it is LeapYear or Not ! ");
        int year = in.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)  ) {
            System.out.println(year + " Year is Leap Year ");
        }
        else{
            System.out.println(year + " Year is Not a Leap Year ");
        }
    }
}