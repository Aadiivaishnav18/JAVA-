import java.util.Arrays;
import java.util.Scanner;

public class Arr_Object {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] Obj = new String[5];

        for( int i=0 ; i<Obj.length; i++ ){
            Obj[i] = in.next();
        }

        System.out.println(Arrays.toString(Obj));

        Obj[1] = "Aditya";

        System.out.println(Arrays.toString(Obj));
    }
}
