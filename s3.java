import java.util.Scanner;

class s3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str=sc.nextLine();
        String str="aba";
        StringBuilder gtr=new StringBuilder(str);
        gtr.reverse();

        
       String s=gtr+" " ;
       if(str.equals(s)){
        System.out.println("palin");
       }
       else{
        System.out.println("nt palin");
       }
    }
}
