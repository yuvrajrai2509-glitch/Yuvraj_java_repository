import java.util.Scanner;
class a10{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
       int r=sc.nextInt();
       System.out.println("enter the coloumn");
       int s=sc.nextInt();
       int[][]matrix=new int[r][s];
       int count=0;
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<r;j++){
            System.out.println("enter the element");
            matrix[i][j]=sc.nextInt();

        }
    

        }
        for(int i=0;i<matrix.length;i++){
             for(int j=0;j<s;j++){
            if(matrix[i][j]!=0){
                count++;
            }
            }
       }
       int avg=(r*s)/2;
       if(count>avg){
         System.out.println("dense");
       }
       else{
        System.out.println(" nt dense");
       }
    }
}