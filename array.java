import java.util.Scanner;
 class array{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   // int[] myarr=new int[5];
   // myarr[0]=2;
   // myarr[2]=3;//
  //  myarr[1]=4;//
  //  myarr[3]=5;//
   // myarr[4]=6;//
   int myarr[]={2,3,4,5,6};
  // int index=2;
   // System.out.println(myarr[0]);
    //System.out.println(myarr[1]);
    //System.out.println(myarr[index]);
    //System.out.println(myarr[3]);
    //System.out.println(myarr[4]);
    int index =0;
    while(index<5){//forlength myarr.length(it will tell array length)
        System.out.println(myarr[index]);
        index++;
    }
    
    }
}