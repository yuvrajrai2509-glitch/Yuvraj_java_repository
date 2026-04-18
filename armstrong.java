import java.util.Scanner;
 class armstrong{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter yur num");
    int number=sc.nextInt();
    int check;

   /* boolean isArmstrong=  isArmstrong(num);
    if(isArmstrong){
        System.out.println("yur num is armstrong");
    }
    else{
        System.out.println("not armstrong num");
    }
    }
    public static  boolean isArmstrong(int num){
        int noOfDigit = noOfDigit(num);
        System.out.println("No of Digit:"+ "noOfDigit");
        int finalNumber=0;
        while(num>0){
            int lastDigit=num%10;
            num/=10;
            finalNumber +=pow(lastDigit , noOfDigit);
        }
        return finalNumber==num;
    }
    public static int pow(int num1,int num2){
        int result=num1;
        int i=0;
        while(i<num2){
            result *=num1;
            i++;
        }
        System.out.println("pow of "+num1+"is"+result);
        return result;


    }
    public static int noOfDigit(int num){
        int digit =0;
        while(num>0){
            digit++;
            num/=10;
        }
        return digit;*/
        int tempNum=number;
        int degree=0;
        while(tempNum>0){
            tempNum/=10;
            degree++;
        }
        int sum=0;
        while(number>0){
            int digit=number%10;
            number/=10;
            sum=sum+(int)(Math.pow(digit,degree));
        }
        if(sum==check){
            System.out.println(".armstrong");
        }
        else{
            System.out.println("no armstrong");
        }

    }
 }