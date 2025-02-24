class op1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        op1 oo=new op1();
        oo.start();
    }
    
}