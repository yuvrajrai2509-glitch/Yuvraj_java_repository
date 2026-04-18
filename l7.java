import java.util.Scanner;
class l7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter yur num");
        int num=sc.nextInt();
        int original=num;
        int n=0;
        while(num>0){
            int digit =num%10;
            num=num/10;
             n=n*10+digit;
         //   num=num/10;
            //for reverse num
            //palindrome

        }
        if(n==original){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}