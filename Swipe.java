import java.util.Scanner;
class Swipe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of A");
        int a=sc.nextInt();
        System.out.println("enter value of B");
        int b=sc.nextInt();

        int c=a;
        a=b;
        b=c;
        System.out.println("value of A is" +a);
        System.out.println("value of B is" +b);
    }
}