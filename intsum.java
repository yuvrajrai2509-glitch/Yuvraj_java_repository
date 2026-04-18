
import java.util.Scanner;

class intsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        int sum=0;
       // int count=0;
        while(num!=0){
      // for(int temp=num;num>0;num=num/10){
            sum+=num%10;
            num=num/10;
           // sum=sum+num;
           // count++;
        
            
        }
        System.out.println(sum);
    
    }
}