import java.util.Scanner;
 class byte{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int number = sc.nextInt();
       byte byteNumber = sc.nextByte();
       System.out.println("User given number is "+number);
       System.out.println("Use given number is"+byteNumber);
    }
}