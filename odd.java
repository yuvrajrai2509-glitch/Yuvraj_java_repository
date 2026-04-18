import java.util.Scanner;
public class odd{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int i;
   for(i=0;i<100;i++){
 if(i%2==0) {
    System.out.println();
}
else{
    System.out.println(i);

}
 System.out.println(i%2==0?"even":"odd");//terneary operator use
 //greater num
 int num1=1; 
 int num2=2; 
 int num3=3; 
  int result =(num1>num2&&num1>=num3)?num1:(num2>=num1&&num2<=num1?num2:num3);
  
  System.err.println(result);
   }
   }
    
}
    
