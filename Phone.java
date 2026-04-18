 public class Phone{
    String brandName;
    float batteryPower;
    long price;
    float camera;
    float weight;
    String colour;

    public void work(){
        System.out.println(brandName+" "+"camera");

    }
    public void ntwork() {
        System.out.println( brandName+"not working");
        
    }
    
    public  void printDetails() {
        System.out.println(brandName+" "+price+" "+colour+" "+camera);
    }
    
 
                 
    
       public static void main(String[]args){
        Phone obj=new Phone();
        obj.brandName="Samsung";
        
          obj.batteryPower=2500;
          obj.price=20000;
          obj.camera=20;
          obj.weight=5;
          obj.colour="black";
          obj.work();
          obj.printDetails();

          Phone obj1=new Phone();
          obj1.brandName="apple";
          obj1.batteryPower=2500;
          obj1.price=20000;
          obj1.camera=20;
          obj1.weight=5;
          obj1.colour="black";
          obj1.work();
          obj1.printDetails();

          Laptop l=new Laptop();
          l.brandName="HP";
          l.batteryPower=2500;
          l.price=200000;
          l.camera=20;
          l.weight=20;
          l.colour="black";
          l.start();
          l.printLaptopDetails();

           Laptop l1=new Laptop();
           l1.brandName="DELL";
           l1.batteryPower=2300;
           l1.price=250000;
           l1.camera=15;
           l1.weight=2;
           l1.colour="GREY";
           l1.start();
           l1.printLaptopDetails();
       }
 }
 
           class Laptop{
           String brandName;
           float batteryPower;
           long price;
           float camera;
           int ram;
           int weight;
           String colour;

        public void start(){
        System.out.println(brandName+"starting be ready brooo");

    }
    public void printLaptopDetails(){
        System.out.println(brandName+" "+colour+" "+camera);
    }
}