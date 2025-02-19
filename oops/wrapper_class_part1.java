//Let us write wrapper class for all the primitive data type
    

public class wrapper_class_part1 {

    public static void main(String[] args) {
        int val1=10; int vv1;
        float val2=35.7f; float vv2;
        char val3='m'; char vv3;
        byte val4=34; byte vv4;
        long val5 =6535; long vv5;
        short val6=36; short vv6;
        double val7=367.77d; double vv7;
        boolean val8=false; boolean vv8;
       
        System.out.println("INTEGER");
        Integer ii=new Integer(val1);
        System.out.println(ii);
        vv1=ii;
        System.out.println(vv1);

        System.out.println("FLOAT");
        Float ff=new Float(val2);
        System.out.println(ff);
        vv2=ff;
        System.out.println(vv2);
        
        System.out.println("CHARACTER ");
        Character cc=new Character(val3);
        System.out.println(cc);
        vv3=cc;
        System.out.println(vv3);
        System.out.println("BYTE ");

        Byte bb=new Byte(val4);
        System.out.println(bb);
        vv4=bb;
        System.out.println(vv4);

        System.out.println("LONG ");

        Long ll=new Long(val5);
        System.out.println(ll);
        vv5=ll;
        System.out.println(vv5);

        System.out.println("SHORT ");
       
        Short ss=new Short(val6);
        System.out.println(ss);
        vv6=ss;
        System.out.println(vv6);

        System.out.println("DOUBLE ");

        Double dd=new Double(val7);
        System.out.println(dd);
        vv7=dd;
        System.out.println(vv7);

        System.out.println("BOOLEAN ");
        
        Boolean bb1=new Boolean(val8);
        System.out.println(bb1);
        vv8=bb1;
        System.out.println(vv8);
    }
    
}
