class example {
    int xx, yy;

   public example(int xx, int yy) {
        this.xx = xx; 
        this.yy=yy;

        System.out.println(xx);
        System.out.println(yy);
    }
}
public class this_key{
    public static void main(String[] args) {
        example obj = new example(10, 20);
        
    }
}
