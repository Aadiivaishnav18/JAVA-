import java.util.Scanner;

public class Max_Range {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = new int[5];

        for(int i = 0; i < arr.length; i++){

            arr[i] = in.nextInt();
        }

        System.out.println(max_Range(arr, 1,3));
    }


    static  int max_Range(int[] arr, int start, int end){

        int max_value = arr[start];

        for(int i = start; i <=end; i++){
            if(arr[i] > max_value){

                max_value = arr[i];
            }
        }

        return max_value;
    }
}
