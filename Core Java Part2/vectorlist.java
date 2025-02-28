
import java.util.*;

public class vectorlist {
    //synchronised , duplicates values accept 
    public static void main(String[] args) {
        Vector v1=new Vector();
        v1.addElement("122");
        v1.addElement(123);
        v1.addElement(17.3f);
        v1.addElement(123);
        v1.addElement("muktha");
        v1.addElement('m');
        System.out.println(v1);


        v1.removeElement("muktha");
        System.out.println(v1);

        System.out.println(v1.get(2));

    }
}