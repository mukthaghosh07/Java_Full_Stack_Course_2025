
import java.util.LinkedList;
//non synchronised, updation is fast , it stores duplicate elements



public class Linkedlist {
    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        System.out.println(ll);
        ll.addLast(30);
        ll.addLast(50);
        ll.addLast(50);

        System.out.println(ll);

        ll.addFirst("muktha");
        ll.addFirst(null);
        ll.addFirst(12.56f);
        System.out.println(ll);
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll);

        System.out.println(" Get First: " +ll.getFirst());
        System.out.println(" Get last: " +ll.getLast());


    }
}
