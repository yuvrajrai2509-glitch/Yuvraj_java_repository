
import java.util.Scanner;

public class fahrenheit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("temperetaure convert");
        System.out.println("enter temp f");
        float fah=sc.nextFloat();
        float cel=(fah-32)*5/9;
        System.out.println(cel);
        
    }
}