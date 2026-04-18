
class twodarray{

    public static void main(String[] args){ 
        int[][] myArr =new int[1][2];
        myArr[0][0]=9;
        int[][] arr = {{1 ,2 ,3},{4 ,5 ,6},{7 ,8 ,9}};
        System.out.println(arr[0].length);
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr.length){
                System.out.print(arr[i] [j]+" ");
              j++;  
            }
            i++;
            System.out.println( );


        }

    }
}