
import java.util.HashSet;
import java.util.Set;

//no duplicates , non order , it stores the value using hash table(key pair value ) where in hash set the jvm will take automatically the key value 


public class Hashset {
    public static void main(String[] args) {
        Set hs=new HashSet();
        hs.add("muktha");
        hs.add(10);
        hs.add(13.56f);
        //no duplicate are allowed
        hs.add(10);
        System.out.println("adding elements: " +hs);
        hs.remove(10);
        System.out.println("after removing: " +hs);



    }
    
}
