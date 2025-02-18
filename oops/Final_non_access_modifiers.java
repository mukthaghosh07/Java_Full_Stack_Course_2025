final class pw1{
    final int a=123;
    final public void main(){
        a=1234;
        System.out.println("final parent class");
    }
}
//method overridding

class pe2 extends pw1{
    public void main(){
       
        System.out.println("final child class");
    }
}

public class Final_non_access_modifiers {
    public static void main(String[] args) {
        
    }
    
}
