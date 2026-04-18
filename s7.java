import java.util.Arrays;
import java.util.Scanner;
class s7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]={"flower","flow","flight"};
        Arrays.sort(arr);
        int count=0;
        String first=arr[0];
    
        String last=arr[arr.length-1];
        int minLength=Math.min(first.length(),last.length());
        String res="";
        for(int i=0;i<minLength;i++){
            if(first.charAt(i)==last.charAt(i)){
                res=res+first.charAt(i);
                count++;
            }
            else{
                break;
            }
        }
           System.out.println(first.substring(0,count));
    }
}