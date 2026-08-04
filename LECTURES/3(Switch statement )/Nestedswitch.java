import java.util.Scanner;

public class Nestedswitch{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value for Employee Name  :");
        int EmpId = in.nextInt();
        System.out.println("Enter value for Department Name :");
        String Dept = in.next();

        switch(EmpId){
            case 1 -> System.out.println("Aditya Vaishnav");
            case 2 -> System.out.println("Krishna Sharma ");
            case 3 -> {

           switch(Dept) {
            case "IT" -> System.out.println("IT Department");
            case "Management" -> System.out.println("Management Department");
            default -> System.out.println("Enter Valid Value ");
           }
           
            }
            default ->  System.out.println("Enter Valid Value ");
        }
    }
}