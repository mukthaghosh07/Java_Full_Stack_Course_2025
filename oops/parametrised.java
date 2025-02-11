class OO {
    int a1;
    float b1;
    char c1;
    double d1;
    String s1;
    boolean bb;
    public OO(int a1, float b1, char c1, double d1, String s1, boolean bb) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.s1 = s1;
        this.bb = bb;
    }
    public void print() {
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(s1);
        System.out.println(bb);
    }
}
public class parametrised {
    public static void main(String[] args) {

        OO obj = new OO(10, 4.5f, 'c', 56.6, "Muktha", false);
        
        obj.print();
    }
}
