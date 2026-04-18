import java.util.Scanner;
class a1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("arr.length");
        int arr[]=new int[2];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
