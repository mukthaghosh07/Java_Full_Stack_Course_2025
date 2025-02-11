class v1{
    int p=45;
    public  void print(){
        System.out.println("multi level Inheritance parent class ");
    }
}

class v2 extends v1{

    public  void print1(){
        System.out.println("multi level Inheritance child class 1");
    }
}

class v3 extends v2{

    public  void print2(){
        System.out.println("multi level Inheritance child class 2 ");
    }
}
public class multi_level {
    public static void main(String[] args) {
        v1 obj1=new v1();
        obj1.print();

        System.out.println("------------------");
        v2 obj2=new v2();
        obj2.print();
        obj2.print1();
        System.out.println("------------------");

        v3 obj3=new v3();
        obj3.print();
        obj3.print1();
        obj3.print2();

    }
    
}
