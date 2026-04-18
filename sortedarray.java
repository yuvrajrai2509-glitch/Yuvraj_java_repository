import java.util.Scanner;
class sortedarray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    System.out.println("Welcome Array sorting");
    System.out.println(" Enter size array ");
    int size=sc.nextInt();
    int[] numArr=new int[size];
    System.out.println("enter"+size+"element");
    for (int i = 0; i < size; i++) {
        numArr[i]=sc.nextInt();
        
    }



    boolean isInc=isIncreascing(numArr);
    boolean isDec=isDecreascing(numArr);
    if(isInc || isDec){
    System.out.println("sorted array");
    }
    else{
        System.out.println("nt sorted array");
    }



}
     public static boolean isIncreascing(int[] numArr){
     int i=1;//index value start from 1
     while(i<numArr.length){
        if(numArr[i]<numArr[i-1]){
            return false;

        }
        i++;
    }
    return true;
 }
 public static boolean isDecreascing(int[] numArr){
  int i=1;//index value start from 1
     while(i<numArr.length){
        if(numArr[i]>numArr[i-1]){
            return false;

        }
        i++;
    }
    return true;
 }
    
}