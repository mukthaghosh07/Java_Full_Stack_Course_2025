public class relationalop {
    public static void main(String[] args) {

        System.out.println("true and false");
       boolean a=true;
       boolean b=false;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(a^b);

        System.out.println("false and false");

        boolean d=false;
        boolean e=false;
        System.out.println(d&&e);
        System.out.println(d||e);
        System.out.println(d^e);
        System.out.println("false and true");

        boolean f=false;
        boolean g= true;
        System.out.println(f&&g);
        System.out.println(f||g);
        System.out.println(f^g);
       
        System.out.println("true and true");

        boolean h=true;
        boolean i=true;
        System.out.println(h&&i);
        System.out.println(h||i);
        System.out.println(h^i);


    }
}
