import java.util.Scanner;
class trial{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the element");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int firstMax=Integer.MAX_VALUE;
        int seccondMax=Integer.MIN_VALUE;

        
        
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
        }
        for (int i = 0; i < 10; i++) {
            if(firstMax<arr[i]){
               firstMax=arr[i];
            }
            for (int i=0; i<n;i++){
            if(seccondMax>arr[i]&&arr[i]!=firstMax){
               seccondMax=arr[i];
            
        }
            
    }
              System.out.println(seccondMax);
}
    }
}