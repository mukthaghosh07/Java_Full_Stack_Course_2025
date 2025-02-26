import java.util.*;
public  class Arraylist1 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("10");
        a.add(23.7);
        a.add(false);
        a.add("muktha");
        a.add('M');

        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        System.out.println(a.get(1));

        // wrapper class
        System.out.println("-----------Integer----------");
        ArrayList <Integer> a1=new ArrayList<Integer>();
        a1.add(12);
        a1.add(13);
        a1.add(68);
        a.add(967);
        System.out.println(a1);
        a1.remove(2);
        System.out.println(a1);
        System.out.println(a1.get(1));

        System.out.println("-----------Float-------------");
        ArrayList <Float> a2=new ArrayList<Float>();
        a2.add(12.5f);
        a2.add(13.87f);
        a2.add(68.88f);
        a2.add(967.2f);
        System.out.println(a2);
        a1.remove(1);
        System.out.println(a2);
        System.out.println(a2.get(1));




    }
    
}