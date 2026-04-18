
import java.util.Scanner;

class lcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num1 = sc.nextInt();
        System.out.println("enter the num2");
        int num2=sc.nextInt();
       // int lcm=lcm(num1,num2);
       // System.out.println("lcm of two num is"+ lcm);
    //}
    // public static int lcm(int num1, int num2){
        int i=0;
        while(true){
            int fact=num1*i;
            if(fact%num2==0&&fact%num1==0){
             return fact;
            }
           // i++;
           // return fact;
        }
        //  return fact;
      
    }
}