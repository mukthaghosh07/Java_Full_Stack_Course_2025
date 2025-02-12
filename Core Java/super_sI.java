class qwe1{
    public void print(int p, int t, int r){
        float si=(float)(p*t*r)/100;
        System.out.println("Simple Interest is : " +si);
    }
}
class qwe2 extends qwe1{
    public void display(){
        super.print(12, 10, 12);
    
        System.out.println("executed successfully");
    }
}
public class super_sI {
    public static void main(String[] args) {
        qwe2 obj=new qwe2();
        obj.display();
    }
    
}
