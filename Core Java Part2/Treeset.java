import java.util.*;

//


public class Treeset {
    public static void main(String[] args) {
  
        Set ts = new TreeSet();
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        System.out.println(" after adding elements: " + ts);
        ts.remove(30);
        ts.remove(50);
    
        System.out.println(" after removing elements: " + ts);
    }
}