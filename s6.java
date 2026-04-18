import java.util.Scanner;
class s6{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
           System.out.println("enter the STRING");
          String str=sc.nextLine();
           String upperstr= str.toUpperCase();
      
         int count=0;
         for (int i = 0; i < str.length(); i++) {
            char ch=upperstr.charAt(i);
            if(ch=='A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
              
               count++;
            }
             
          }
            System.out.println(" no of vowel"+count);



    }
}