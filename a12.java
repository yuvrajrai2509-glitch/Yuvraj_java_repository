import java.util.Scanner;
class a12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enterr the row element");
        int a=sc.nextInt();
        System.out.println("enterr the col element");
        int b=sc.nextInt();
        int matrix[][]=new int[a][b];
        int count=0;
        for(int i = 0; i <matrix.length; i++) {
        for(int j = 0; j<b; j++) {
            System.out.println("enter the num");
            matrix[i][j]=sc.nextInt();
        }
        }
         for(int i = 0; i <matrix.length; i++) {
         for(int j = 0; j<b; j++) {
            if(matrix[i][j]==0){
              count++;
            }
        }
         }
         int avg=(a*b)/2;
         if(count>avg){
            System.out.println("sparse matrix");
         }
         else{
            System.out.println("nt sparse mat");
         }

    }
}