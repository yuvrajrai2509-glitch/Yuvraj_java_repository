class arrayminterm{
    public static void main(String[] args) {
        int num[]={-1,2,3,4,5,-6989,7,8,9};
        int min=num[0];
    
        for(int i = 0; i < num.length; i++) {
           if(num[i]<min){
            min =num[i];
        
            }
        }
          // System.out.println("min value array"+" "+min);or
               System.out.print(min);
            
        
    }
}