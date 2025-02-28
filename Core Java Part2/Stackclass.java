
import java.util.Stack;
//FIFO , allows duplicate values 


public class Stackclass {
    public static void main(String[] args) {
        Stack ss=new Stack();
        ss.push(10);
        ss.push(20);
        ss.push(30);
        ss.push(40);
        ss.push(50);
        ss.push(50);
        ss.push(60);
        System.out.println("Push elements: "+ss) ;

        ss.pop();
        ss.pop();
        System.out.println("after popping elements: " +ss);

        
        System.out.println("Second Index value : "+ss.get(2));

    }
    
}
