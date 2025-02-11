class pre1{
    int aa=10; 
    int bb=29;
    public void demo(){
        aa++;
        System.out.println(aa);
    }

    public int demo1(){
        bb--;
        return bb;
    }
}
public  class voidemo {

    public static void main(String[] args) {
        pre1 obj=new pre1();
        obj.demo();
        System.out.println(obj.demo1());
    }
    
}