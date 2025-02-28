import java.util.ArrayList;
import java.util.ListIterator;

public class listiterator {
    public static void main(String[] args) {
        ArrayList <String> aa=new ArrayList <String>();
        aa.add("muktha");
        aa.add("payal");
        aa.add("ankit");
        aa.add(null);
        System.out.println(aa);
        ListIterator <String> ll=aa.listIterator();
        while (ll.hasNext()){
        String a1=ll.next();

        System.out.println(a1);
    }
        System.out.println("----------- backward-------------");
        while(ll.hasPrevious()){
            String a2=ll.previous();
            System.out.println(a2);
        }
    }
    
    
}
