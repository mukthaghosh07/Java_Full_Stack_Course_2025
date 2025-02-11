class a{
    int a1=54;
    public void slepp() {
        System.out.println("hirearical parent class");
    }
}
class b extends a{
    float a2=54.2f;
    public void slepp1() {
        System.out.println("hirearical child B class");
    }
}

class c extends a{
    char v='a';
    public void slepp2() {
        System.out.println("hirearical child C class");
    }
}
public class hireacrical {

    public static void main(String[] args) {
        a val1=new a();
        System.out.println(val1.a1);
        val1.slepp();
        System.out.println("----------------");
        
        b val2=new b();
        System.out.println(val2.a2);
        val2.slepp1();
        val2.slepp();
        System.out.println("----------------");
        c val3=new c();
        System.out.println(val3.v);
        val3.slepp();
        val3.slepp2();

    }
    
}
