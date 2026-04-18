import java.util.Scanner;

class s2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            System.out.print(str.length());
          //String str=sc.nextLine();
         boolean small=true;
         char ch=str.charAt(i);
         int asci=(int)ch;
         if(asci>=97)small=false;//flag means small//space print ho uske liyeif(ch'==')continue;
        
        if(small==true){
            asci+=32;
            char dh=(char)asci;
           str= str.substring(0,i)+dh+str.substring(i+1);
        }
        else{
             asci-=32;
            char dh=(char)asci;
            str.substring(0,i);
             str= str.substring(0,i)+dh+str.substring(i+1);

        }
        System.out.print(str);
        }
    }
    }