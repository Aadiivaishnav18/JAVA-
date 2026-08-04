import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Fruit name :");
        String fruits = in.next();

        switch (fruits) {
            case "Mango" -> System.out.println("King of Friuts");
            case "Apple" -> System.out.println(" A sweet Red fruit ");
            case "Graphs" -> System.out.println("small size fruit ");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("Please Enter the Valid fruits");
        }
    }

}
