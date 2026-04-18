
import java.util.Scanner;

public class grade{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=90){
            System.out.println("grade o");
        }
        else if (num>=75){
            System.out.println("grade a");
        }
        else if(num>=60){
            System.out.println("grade b");
        }
        else if(num>=30){
            System.out.println("grade c");
        }
    
        
        else{
            System.out.println("do work hard");
        }

        
    }
}