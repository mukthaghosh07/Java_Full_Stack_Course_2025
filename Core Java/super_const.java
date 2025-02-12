class qwe3{
    public qwe3(){
        System.out.println("parent class constructor");
    }
}
class qwe4 extends qwe3{
    public qwe4(){
        super(); // to access constructor 
        System.out.println("child class constructor");
    }
}

public class super_const {
    public static void main(String[] args) {
        qwe4 obj=new qwe4();
    }
}
