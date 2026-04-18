
import java.util.Scanner;

class electricity{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in) ;
       int unit=sc.nextInt();
       if(unit<100){
        System.out.println("1 rupee");
       }
       else if(unit>100&&unit<200){
        System.out.println("2");
       }
       else if(unit>200&&unit<300){
        System.out.println("3 rupee");
       }
       else{
        System.out.println("4");
       }
    }
}