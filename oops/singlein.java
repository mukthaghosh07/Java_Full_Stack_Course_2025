class first{
int v1=45;
public void demo(){
    System.out.println("first inheritances ");
}
}

class second extends first{

}

public class singlein {
public static void main(String[] args) {

    second obj2=new second();
    System.out.println(obj2.v1);
    obj2.demo();

}
    
}
