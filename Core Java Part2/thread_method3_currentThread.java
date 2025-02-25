class we12 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread());
            System.out.println(i);
            try{
            Thread.sleep(2000);
        }
        catch (Exception ee){
            
        }
        }
    }
}

public class thread_method3_currentThread {
    public static void main(String[] args) {
        we12 oi1=new we12();
        oi1.start();


        we12 oi11=new we12();
        oi11.start();
    }
}
