import java.util.Scanner;
 class suminteger{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num");
        int num=sc.nextInt();
       //int sum=sumdigit(num);
       // System.out.println("sum digit is"+sum);



        
    //}
    //public static int sumdigit(int num){
      int sum=0;
        while(num>0){
            
            sum+=num%10;
            num/=10;
        }
       // return sum;
       System.out.println("sum of digit is"+sum);


    }
}