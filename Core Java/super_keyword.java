class pre2{
    int x1=23;
    public void print(){
        System.out.println("super class parent class");
    }
}
class pre11 extends pre2{
    public void print1(){
        System.out.println("child superclass");
        System.out.println(super.x1);
        super.print();
        System.out.println("finally executed");
    }
}

public class super_keyword {
    public static void main(String[] args) {
        pre11 obj=new pre11();
        obj.print1();
    }
    
}
