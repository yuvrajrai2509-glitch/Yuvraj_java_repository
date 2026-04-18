import java.util.Scanner;
class stringpalindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder gtr=new StringBuilder(str);
        gtr.reverse();
        String s=gtr.toString();
        if(str.equals(s)){
            System.out.println("palindrome string");
        }
        else{
            System.out.println("nt palin");
        }
    }
}