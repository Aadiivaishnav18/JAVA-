import java.util.Scanner;

public class Max_value {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(max(arr));
    }

    static int  max(int[] arr){

        int max_value = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] >max_value ){

                max_value = arr[i];
            }
        }
    return  max_value;
    }
}
