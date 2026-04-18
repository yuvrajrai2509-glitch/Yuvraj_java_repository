import java.util.Scanner;                                                                       
class greater {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);//user se input lene ke liye ye lete hai 
    int n=sc.nextInt();

    if(n%3==0){        //=ka sign lagane ka matlab hai ki = bhi rahega to wo read karke show kar dega 
        System.out.println("fizz");//&& ka matlab and hota hai
    }
    else if(n%5==0){
        System.out.println("buzz");
    }
        else if(n%5==0&&n%3==0){
     System.out.println("fizz buzz");
    }
    else{
    System.out.println("n");

    }
    
    

    

    
}
}