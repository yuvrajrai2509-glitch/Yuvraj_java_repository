import java.util.Scanner;
class amethod{
    public static void main(String[]args);
    System.out.println("welcome to max min");
    int[] numArr=ArrayUtility.InputArray();
    int max=max(numArr);
    int min=min(numArr);
    System.out.println("Maximum element  Array is"+max);
    System.out.println("Minimum element Array is"+min);
}

public static void max(int[]numArr){
    int min=Integer.MAX_VALUE;
    int i=0;
    while(i<numArr.len){
        if(min>numArr[i]){
            min=numArr[i];
        }
        i++;
    }
    return 0;
}
public static void min(int[]numArr){
    if(numArr.length==0){
        return Integer.MIN_VALUE;
    }
    int max =numArr[0];
    int i=1;
    while(i<num Arr.len){
     if(max<num[i]Arr.len){
        max=num Arr[i];
        
     }
     i++;
    }
    return max;
}