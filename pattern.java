  public class pattern{
    public static void main(String[] args){
        printFirstPattern();
        printSecondPattern();
        printThirdPattern();
        
    }

        public static void printFirstPattern(){
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
        }
         public static void printSecondPattern(){
            System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
            int rows = 0;
            while(rows<0){
            System.err.println("*");
            int i=0;
            while(i<rows){
            System.out.println("*");
            i++;
            }
            System.out.println();
            rows++;
            }

        }
        public static void printThirdPattern(){
            System.out.println("******");
            System.out.println("*****");
            System.out.println("****");
            System.out.println("***");
        }

        
    
}