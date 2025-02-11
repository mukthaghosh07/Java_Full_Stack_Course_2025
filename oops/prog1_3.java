class pr2{
    int v1=223;
    int v2=37;


    public void print(){
        --v1;
        System.out.println("v1: "+v1);
    }

    public void demo(){
        --v2;
        System.out.println("v2: "+v2);
    }
}


public class prog1_3 {
    public static void main(String[] args) {
        pr2 obj=new pr2();
        System.out.println(obj.v1);
        obj.print();
        System.out.println(obj.v2);
        obj.demo();

    }
}
