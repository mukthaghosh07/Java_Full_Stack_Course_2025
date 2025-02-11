
class Ooi2 {
    float f;
    char c;
    String s;

    public Ooi2(float f1, char c1, String s1) {
        f = f1;
        c = c1;
        s = s1;
        System.out.println(f);
        System.out.println(c);
        System.out.println(s);
    }
    public Ooi2(String s1, float f1, char c1) {
        s = s1;
        f = f1;
        c = c1;
        System.out.println(s);
        System.out.println(f);
        System.out.println(c);
    }
}

public class constoverloadingpart3 {
    public static void main(String[] args) {
        Ooi2 obj2 = new Ooi2(2.563f, 'm', "Muktha");
        Ooi2 obj3 = new Ooi2("java", 5.12f, 'b');
    }
}

