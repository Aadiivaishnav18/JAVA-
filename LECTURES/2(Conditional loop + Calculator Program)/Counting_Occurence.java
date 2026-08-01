public class Counting_Occurence{

public static void main(String[] args) {

    // Without Taking Input // 

    int n = 523363;
   int count = 0 ;


   while (n > count) {

    int rem = n % 10 ;
    if(rem == 3 ){
        count++ ;
    }
    n = n /10;

   }
   System.out.println(count);


  // WithTaking Input //

  



}

}