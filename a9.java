
import java.util.Scanner;

class a9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the row");
        int r=sc.nextInt();
        System.out.print("enter the coloumn");
        int s=sc.nextInt();
        int[][]matrix=new int[r][s];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("enter the element");
                matrix[i][j]=sc.nextInt();
            }

        }
        int count=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                if(i==j&&matrix[i][j]!=1){
                    count=1;
                    // System.out.println("identity");
                }
                if (i != j && matrix[i][j] != 0) {
                    count = 1;
                }
            }
        }
                 if (count == 0 && r == s) {
            System.out.println("it is an identity matrix");
        } 
            else {
            System.out.println("it is not an identity matrix");


            
        }


        }

    }
    