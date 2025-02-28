
import java.util.Map;
import java.util.TreeMap;

public class child extends TreeMap{
    public static void main(String[] args) {
        Map ts=new TreeMap();
        ts.put("aa", 110);
        ts.put("bb", 120);
        ts.put("cc", 130);
        ts.put("dd", 140);
        ts.put("ee", 150);
        System.out.println(ts);

        System.out.println(ts.get("dd"));




    }
    
}
