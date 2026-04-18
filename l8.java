
import java.util.Scanner;

class l8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        int sum=0;
         if(num==1){
                System.out.println("prime");
            }
        for (int i = 1; i<=num; i++) {
            if(num%i==0){
                count++;

                
            }    
        }
        
        
    if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
        

        sc.close();
    }
}