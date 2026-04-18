import java.util.Scanner;
class a7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                min=arr[i];
            
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max"+max);
        System.out.println("min"+min);
    }
}