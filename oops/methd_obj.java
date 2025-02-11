
class pr1{
    int val1=56;
    int val2=67;
    public void show(){
        ++val1;
        System.out.println("val1: "+val1);
    }

    // method 2
    public void demo(){
        ++val2;
        System.out.println("val2: "+val2);
    }
}

public class methd_obj {
    public static void main(String[] args){
        // constructor (object)
        pr1 obj=new pr1();

        System.out.print(obj.val1+" ");
        System.out.println(obj.val2);

        // call the method
        obj.show();
        obj.demo();


    }
}
