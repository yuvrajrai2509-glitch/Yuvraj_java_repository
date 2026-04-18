
import java.util.Scanner;

public class largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("greater="+a);
        }
        else if(b>a){
            System.out.println("lar ="+b);
        }
        else{
            System.out.println("eual num");
        }


    }
}