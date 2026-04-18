
import java.util.Scanner;

public class rectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("perimeter of rectangle");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
         double perimeter =a+b+c+d;
        System.out.println("perimeter of rectangle"+ perimeter +"cm");
        
    }
}