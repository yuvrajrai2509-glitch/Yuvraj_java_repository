
import java.util.Scanner;

class lswitch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         System.out.println("enter the month");
        switch(num){
         case 1:
         System.out.println("jan");
         case 2:
         System.out.println("feb");
         break;
         case 3:
         System.out.println("mar");
         break;
         case 4:
         System.out.println("apr");
         break;
         case 5:
         System.out.println("may");
         break;
         case 6:
         System.out.println("jun");
         case 7:
         System.out.println("jul");
         break;
         case 8:
         System.out.println("aug");
         break;
         case 9:
         System.out.println("sep");
         break;
          default:
        }
    }
}