import java.util.*;
public class si{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("simple interest");
        System.out.println("p");
        double p = sc.nextDouble();
        System.out.println("r");
        double r = sc.nextDouble();
        System.out.println("t");
        double t = sc.nextDouble();
        double si =(p*r*t)/100;
    
        double totalAmount=si+p;
        System.out.println(si);
        System.out.println(totalAmount);
        




    }
}