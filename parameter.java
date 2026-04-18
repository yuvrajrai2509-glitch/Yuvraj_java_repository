public class parameter{
    public static void main(String[] args) { 
        System.out.println(sumTwoNum(4,8));
        System.out.println(sumTwoNum(5,8));
        System.out.println(sumTwoNum(3,8));

    }
    public static int sumTwoNum(int first , int second ){
            System.out.println("first num received"+first);
              System.out.println("sceond num received"+second);
        int sum=first+second;
        return sum;

    }
}