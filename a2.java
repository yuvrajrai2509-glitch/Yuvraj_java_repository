
import java.util.Scanner;

class a2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("num yu want to find");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArr,num);
        System.out.println("yur found ");

    }
    public static int noOfOccurrences(int[] numArr,int num){
        int occ=0;
        int i=0;
        while(i<numArr.length){
            if(numArr[i]==num){
                occ++;
            }
            i++;
        }
        
        return occ;
    
    }
}