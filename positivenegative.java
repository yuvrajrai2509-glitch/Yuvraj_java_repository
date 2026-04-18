import java.util.Scanner;
class positivenegative{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int postive=0;
        int negative=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
               if(arr[i]<0){
                negative++;
              }
               else{
                     postive++;
               }
        }
            System.out.println("postive"+postive);
            System.out.println("neagative"+negative);
        
        
    }
}