import java.util.Arrays;
import java.util.Scanner; 
class s5{

   // import java.util.Arrays;
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("enter the s1 word ");
         String s1=sc.nextLine();
         System.out.println("enter the s2 word ");
         String s2=sc.nextLine();
         if(s1.length()!=s2.length()){
           System.out.println("n0t  anagram");
            return;
        }
    
       
         char[] arr1 = s1.toCharArray();
         char[] arr2 = s2.toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         if(Arrays.equals(arr1,arr2)){
            System.out.println("anogram");
        }
         else {
            System.out.println("nt annogram");
        }
       
    }
}