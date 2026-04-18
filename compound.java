import java.util.Scanner;
public class compound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("compound interest");
        System.out.println("p");
        double p = sc.nextDouble();
        System.out.println("r");
        float r = sc.nextFloat();
        System.out.println("t");
        double t = sc.nextDouble();
        double ci =p*Math.pow(1+r/100)*t;
    
        double totalAmount=ci+p;
        System.out.println(ci);
        System.out.println(totalAmount);
        




    }
}