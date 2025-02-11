class pre{
    int x;
    public pre(){
        x=10;
    }
    public void print(){
        --x;
        System.out.println("current value: "+x);

    }
}
public class defaultconst {
    public static void main(String[] args) {
        pre by=new pre();
        by.print();
    }
    
}
