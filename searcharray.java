
import java.util.Scanner;

public class searcharray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={2,4,58,45,69,85,45,88,79,64};
        System.out.println("welcome to array search");
        int num=sc.nextInt();
        boolean isfound =isfound(arr,num);
        if(isfound){
            System.out.println("found in array");
        }
        else{
            System.out.println(" not found in array");
            
        }

    }
    public static boolean isfound(int[]arr,int num) {
        int index=0;
        while(index<arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
        
    }
}