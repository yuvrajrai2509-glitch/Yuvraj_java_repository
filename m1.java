class m1{
    public  void sum(int num1,int num2){
        System.out.println("sum");
        int total=num1+num2;
        
        
        System.out.println(total);
    }
    public static void sub(int num1,int num2) {
        System.out.println("sub");
        int total =num1- num2;
        System.out.println(total);
    }
     public static void multi(int num1,int num2) {
        System.out.println("multi");
        int total =num1* num2;
        System.out.println(total);
     }
     public  void div(int num1,int num2) {
        System.out.println("div");
        int total =num1/ num2;
        System.out.println(total);
     }
    public static void main(String[] args) {
        
       m1 ms=new m1();
       // ms.total(5,5);
      ms. sum(5,5);
           sub(10,20);
           multi(20,30);
           ms.div(99,3);
        
    
        
    }
}
