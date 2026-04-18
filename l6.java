import java.util.Scanner;
class l6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the num");
        System.out.println("please enter the num upto wich series has to be printed:");
        int first=sc.nextInt();
        System.out.println("here is fibonacci series");
        printfibonaci(first);

    }
    public static void printfibonaci(int num) {
        if(num<0) return;
        System.out.print("0");
         if(num==0) return;
         System.out.print("1");
        int first =0;
        int second =1;
        while(first+second<=num){
            int third=first+second;
            System.out.println(third+" ");
            first=second;
            second=third;

        }
        
    }
}