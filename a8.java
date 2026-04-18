
import java.util.Scanner;

class a8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  int size=sc.nextInt();
        int sum=0;
        int product=1;
       // int arr[][]=new int[i][j];
        System.out.print("enter row");
        int row=sc.nextInt();
        System.out.print("enetr col");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for (int i = 0; i <row; i++) {
        
            for(int j=0;j<col;j++){
            
            arr[i][j]=sc.nextInt();
        
            sum+=arr[i][j];
           
            product*=arr[i][j];
            }
            
        }
        System.out.print("sum of element"+sum);
          System.out.print("product of element"+product);
        
}
}