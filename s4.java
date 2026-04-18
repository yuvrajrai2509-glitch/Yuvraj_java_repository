import java.util.Scanner;
class s4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       String result="";//for small upper case lower keliye ch+32 
        for (int i = 0; i <str.length(); i++) {
            char ch=str.charAt(i);
       /* if(ch>='a'&&ch<='z'){
            char chS=(char)(ch-32);
            result=result+chS;
        }
        else{
            result=result+ch;
        }*/
       //System.out.println(str.toUpperCase());
       //System.out.println(str.toLowerCase());

            
        }
         System.out.print(str.toUpperCase());
       System.out.print(str.toLowerCase());
       // System.out.println(result);
    }
}