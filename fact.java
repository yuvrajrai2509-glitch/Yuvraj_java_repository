
import java.util.Scanner;

class fact{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        //long fact=factorial(num);
        //System.out.println("factorial is"+fact);

    //}
    //public static long factorial(int num){
       // if(num<2){
            //return 1;
       // }
        long fact =1;
       int i=2;
        while(i<=num){
      
            fact*=i;
            i++;
        }
        
     // return fact;
     System.out.println(fact);
    }
}