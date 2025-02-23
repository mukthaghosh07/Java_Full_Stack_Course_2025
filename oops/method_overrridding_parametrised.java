class one{
    public void print(int aa){
        System.out.println("print the first value : " +aa);
    }
    public int prinqt(int b){
        b++;
        System.out.println(b);
        return b;
    }
}
class two extends one{
    public void print(int bb, int aa){
        System.out.println("method overriding subclass: " +bb);
        System.out.println("method overriding subclass: " +aa);

    }
    public int prinqt(int b){
        b++;
        System.out.println(" after overrridding: "+b);
        return b;
    }
}

public  class method_overrridding_parametrised {
    public static void main(String[] args) {
        two tt=new two();
        tt.print(10,12);
        tt.prinqt(23);

        one oo=new one();
        oo.prinqt(10);
    }
    
}