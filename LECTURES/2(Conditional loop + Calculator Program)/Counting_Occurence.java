import java.util.Scanner;

public class Counting_Occurence{

public static void main(String[] args) {

    // Without Taking Input // 

//     int n = 523363;
//    int count = 0 ;


//    while (n > count) {

//     int rem = n % 10 ;
//     if(rem == 3 ){
//         count++ ;
//     }
//     n = n /10;

//    }
//    System.out.println(count);


  // WithTaking Input //

  Scanner in = new Scanner(System.in);

  System.out.println("Enter the Numbers :");
  int n= in.nextInt();
  int count[] = new int[10];


  while (n > 0){

    int rem = n % 10;
    count[rem]++;
    n = n / 10;
  }

  System.out.println("Frequency of digits:");

        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println(i + " -> " + count[i] + " times");
            }
        }

}

}