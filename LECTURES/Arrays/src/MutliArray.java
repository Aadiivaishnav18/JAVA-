import java.util.ArrayList;
import java.util.Scanner;

public class MutliArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initalization part- if we do not initialise here so it will give the error in it  //

        for(int i = 0 ; i < 3; i++){
            list.add(new ArrayList<>());
        }

        // add element //
        for(int i = 0 ; i < 3; i++){
            for(int j = 0; j < 3; j++){

                list.get(i).add(in.nextInt());
            }
        }

        System.out.print(list);
    }

}
