
import java.util.Enumeration;
import java.util.Vector;

public class enumeration extends Vector{
    public static void main(String[] args) {
        Vector  v=new Vector();
        v.addElement(12.2);
        v.addElement("muktha");
        v.addElement(12);
        v.addElement("java");
        v.addElement(null);

        Enumeration ee=v.elements();
        int idx=0;
        while(ee.hasMoreElements()){
            Object oo=ee.nextElement();
            System.out.println(oo);
        }


    }
    
}
