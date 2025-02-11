class oop1 {
    float x1;
    double x2;
    char c;

    public oop1(float xx1, double xx2) {
       x1 = xx1;  
       x2 = xx2;
        System.out.println(x1);
        System.out.println(x2);
    }

   
    public oop1(float val1, double val2, char c1) {
       x1 = val1;
       x2 = val2;
       c = c1;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(c);
    }
}

public class constoverloading {
    public static void main(String[] args) {
        oop1 obj = new oop1(2.34f, 67.2d);
        oop1 obj2 = new oop1(1.23f, 45.6d, 'q'); 
    }
}
