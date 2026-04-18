import java.util.Scanner;
class l10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long fact=1;
        int i=1;
        while(i<=num){
            fact*=i;
            i++;
        }
        System.out.println(fact);
    }
}