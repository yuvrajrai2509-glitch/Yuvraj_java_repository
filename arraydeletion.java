import java.util.Scanner;
 class arraydeletion{
    public static void main(String[]args){
           Scanner sc=new Scanner(System.in);
           System.out.println("Welcome array deletion");
           int[] numArr=ArrayUtility.inputArray();
           System.out.print("Enter the num");
           int numToDelete=sc.nextInt();
           int[] newArr=deleteNumber(numArr,numToDelete);
           System.out.println("enter your new array");
           ArrayUtility.displayArray(newArr);



    }
       public static int[]deleteNumber(int[]num,int numToDelete){
        int occ=OccurancesArray.noofOccurences(numArr,numToDelete);
        if(occ==0){
            return numArr;

        }
           int newSize=numArr.length-occ;
           int[] newArr=new int[new size];
           int i=0 ,int j=0;
           while(i< numArr.length){
            if(numArr[i]=numToDelete){
                newArr[j]=numArr[i];
                j++;

            }
                i++;
           }
                return newArr;



    }
 }