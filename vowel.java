  import java.util.Scanner;
  class vowel {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter char");
    char ch = sc.next().charAt(0); //char at 5 ka matlab index jisko puchna hai yaha index value kuch bhi ho sakta hai 
   // if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U'){
       // System.out.println(ch + "is vowel");
//}
   // else{
       // System.out.println(ch + "is cons");}
       if(ch>='a'&&ch<='z'){
        System.out.println("lowercase");
       }
       else{
        System.out.println("upercase");
       }
    

}
}