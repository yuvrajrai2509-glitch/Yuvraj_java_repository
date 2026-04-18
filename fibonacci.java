import java.util.Scanner;
class fibonacci{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
    
        int firstnum=0;
        int secondnum=1;
        for (int i = 0; i <= n; i++) {
             int sum=firstnum+secondnum;
             System.out.print(firstnum+"");
             firstnum=secondnum;
             secondnum=sum;
    
        }
    }
}
