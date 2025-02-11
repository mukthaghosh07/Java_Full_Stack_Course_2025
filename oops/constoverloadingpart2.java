class ooi1{
    float f;
    char c;
    String s;


    public ooi1(float f1, char c1, String s1){
        f=f1;
        c=c1;
        s=s1;
        System.out.println(f);
        System.out.println(c);
        System.out.println(s);
    }
    public ooi1(float f1){
        f=f1;
        
        System.out.println(f);
     
    }
}

public class constoverloadingpart2 {

    public static void main(String[] args) {
        ooi1 obj=new ooi1(2.4f);


        ooi1 obj2=new ooi1(2.563f,'m',"muktha");
    }
    
}
