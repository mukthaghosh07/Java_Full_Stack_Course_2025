class we121 extends Thread{
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
public class thread_method4_setpriority {
    public static void main(String[] args) {
        we121 oiu1=new we121();
        oiu1.start();
        oiu1.setPriority(1);



        we121 mp1=new we121();
        mp1.start();
        mp1.setPriority(10);
    }
}
