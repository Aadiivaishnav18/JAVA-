import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name: ");

        String name = in.nextLine().trim();
        // Here We use nextLine() that help to write the Complete String with Space

        System.out.println("Namaste " + name);
    }
}