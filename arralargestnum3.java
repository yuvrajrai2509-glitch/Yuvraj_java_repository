class arralargestnum3{
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9};
        int largestnum=0;
        for(int i = 0; i < num.length; i++) {
            if(num[i]>largestnum){
                largestnum=num[i];
            }
        }
            System.out.print(largestnum);

            
        
    }
}