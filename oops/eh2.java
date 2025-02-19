

public class eh2 {
    public static void main(String[] args) {
        int a=10;
        int b;
    
    try{
      
        b=a/0 ;
        System.out.println(b);
    }
    catch(ArithmeticException e){
    System.out.println("please a proper va");
}
    } 
    
}
