import java.util.Scanner;
class leap{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num%400==0){ //for century year
            System.out.println("Leap year");

        }
        else if(num%4==0&&num%100!=0){//not century year 
            System.out.println("leap");

        }
        else{
            System.out.println("not leap year");
        }
    }
}