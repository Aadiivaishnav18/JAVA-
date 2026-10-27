import java.util.Arrays;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
//        int [] arr = {1, 3, 23, 18 ,133 };


        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        swap(arr, 1,3);
        System.out.println(Arrays.toString(arr));


    }


    static void swap(int[] arr , int index_1, int index_2){

        int temp = arr[index_1];
        arr[index_1] = arr[index_2];
        arr[index_2] = temp;
    }

}
