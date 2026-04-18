import java.util.Scanner;
public class offer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("age calculator ");
        int age = sc.nextInt();
        if(age>=0&&age<=13) {
            System.out.println("child");
        }
        else if(age>=13&&age<=20 ){
            System.out.println("teen");
        }
        else if(age>=20&&age<=60){
            System.out.println("adult");
        }
        else{
            System.out.println("senior");
        }
    }
}