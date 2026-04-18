import java.util.Scanner;
class s11{
    public static void main(String[] args) {
          Scanner sc=new Scanner("System.in");
          System.out.println("enter the string");
          String str=sc.nextLine();

          String reversed = new StringBuilder(str).reverse().toString();
          System.out.println("Reversed:" + reversed);

    }
}