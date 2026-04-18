import java.util.Scanner;
class primearray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]%2!=0&&arr[i]%arr[i]==0){
                System.out.println("prime num"+arr[i]);

            }
            else{
                System.out.println("nt prime number"+arr[i]);
            }
        }
    }
}