class pr3{
    float v1=22.2f;
    String v2="muktha";


    public void print(){
        --v1;
        System.out.println("v1: "+v1);
    }

    public void demo(){
        
        System.out.println("v2: "+v2);
    }
}


public class prog2_3 {
    public static void main(String[] args) {
        pr3 obj=new pr3();
        System.out.println(obj.v1 +" "+ obj.v2);
        obj.demo();
        obj.print();
System.out.println("-----------------------");
System.out.println("-----------------------");
System.out.println("-----------------------");

        pr3 obj1=new pr3();
        System.out.println(obj1.v1 +" "+ obj1.v2);
        obj1.demo();
        obj1.print();
       

    }
}
