
class pe1{
    static float f=12.87f;
    static char c='a';
    static public void print(){
        System.out.println("Static class");
    }
}

public class static_non_access_modifers {

    public static void main(String[] args) {
        pe1.print();
        System.out.println("value1: " +pe1.f);
        System.out.println(" value2: "+pe1.c);
    }
}