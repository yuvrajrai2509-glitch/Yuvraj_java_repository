import java.util.Scanner;
class ushank{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
      // int n;
       int reverse=0;
       
       while(num!=0){
            int n=num%10;
         //   num/=10;
              reverse= reverse*10+n;
               num/=10;
       }
            System.out.println(reverse);
    }
}
