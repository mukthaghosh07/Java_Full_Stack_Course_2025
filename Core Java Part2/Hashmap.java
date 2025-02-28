
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map hp=new HashMap();
        hp.put("a", 10);
        hp.put("b", 30);
        hp.put("c", 60);
        hp.put("d", 80);
        System.out.println(hp);
   
        System.out.println(hp.get("b"));

        Integer i=new Integer(20);
        hp.put("e",100);
        System.out.println(hp);



    }
    
}
