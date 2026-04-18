
import java.util.Scanner;

class l4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter th num");
        int num=sc.nextInt();
         num=2;
         int i;
        for ( i = 0; i < 10; i++) {
            if(i%num==0){
            System.out.println(num+"is prime" );
         }
         else {
            System.out.println(num +"is not prime");
             }
        }
    }
}
