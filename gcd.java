import java.util.Scanner;

class gcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num1 = sc.nextInt();
        System.out.println("enter the num2");
        int num2 = sc.nextInt();
        int gcd=gcd(num1,num2);
        System.out.println("gcd num is "+gcd);
    }
    public static int gcd(int num1,int num2){
        int gcd=1;
        int i=2;
        int least=least(num1,num2);
        while(i<=least){
            if(num1%i==0&&num2%i==0){
                gcd=i;
            }
        }
        return gcd;

    }
     public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }
            else{
                return 2;
            }
            
        }

}

