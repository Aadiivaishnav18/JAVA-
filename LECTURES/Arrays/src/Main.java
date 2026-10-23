import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
             arr[i] = in.nextInt();
        }

        // we can also be done like this

        System.out.println(Arrays.toString(arr));

//        // For each loop
//        for(int num: arr){
//            System.out.print(num + " ");
//        }
    }
}