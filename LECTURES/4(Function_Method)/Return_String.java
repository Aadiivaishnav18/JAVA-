

public class Return_String {
    
    public static void main(String[] args) {
        
        String Greeting = greet("Aditya Vaishnav");
        System.out.println(Greeting);
    }

    static String greet( String name){
        String message = "Hello " + name;
        return message;


    }
}
