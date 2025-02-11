class pre2{
    public void print(int a){
        System.out.println("parent class with value:" +a);
    }

}
class pre3 extends pre2{
    public void print(int a){
        System.out.println("child class with value:" +a);
    }
}
public class moethodoverrridding {
    public static void main(String[] args) {
        pre3 obj=new pre3();
        obj.print(10);
        
    }
}
