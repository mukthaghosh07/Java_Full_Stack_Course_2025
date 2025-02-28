
import java.util.ArrayList;
import java.util.Iterator;
public class interator {
    public static void main(String[] args) {
        ArrayList aa=new ArrayList();
        aa.add("muktha");
        aa.add("payal");
        aa.add("ankit");
        aa.add(109.8);
        aa.add(12);
     
        Iterator q=aa. iterator();
        int i=0;
        while(q.hasNext()){
            Object oo=q.next();
            if(i==3){
                q.remove();
                System.out.println("Removed" +i +" " +"index ");
            } i++;       
        }
        System.out.println(aa);
        
    }
    
}