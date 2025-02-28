import java.util.PriorityQueue;

public class priorityclass {
    public static void main(String[] args) {
        PriorityQueue pp = new PriorityQueue();
    
        pp.add(10);
        pp.add(20);
        pp.add(30);
        pp.add(40);
        pp.add(50);
      
        System.out.println(" after adding elements: " + pp);
        pp.remove(30);
        pp.remove(50);
        System.out.println(" after removing elements: " + pp);
    }
}
