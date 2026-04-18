
import java.util.Scanner;

class Febo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int sum;
        int n=sc.nextInt();
        while(n!=0){
            System.err.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
            n=n-1;
        }
    }
}
