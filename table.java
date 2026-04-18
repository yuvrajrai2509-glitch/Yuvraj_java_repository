
import java.util.Scanner;

class table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("multipication table");
        int num =sc.nextInt();
       // printMultiplicationTable(num);//with using metod 
    //}
   // public static void printMultiplicationTable( int num){
       // int i=1;
       // while(i<=10){
         //   System.out.println(num*i);
        //    i++;
       // }
      // int i=1; //without using method
       for( int i = 1; i <= 10; i++) {//i++ in place of i+=1 yu can write
         int table =num*i;
       System.out.println(num+"*"+i+"="+(num*i));
           
       }



    }
}