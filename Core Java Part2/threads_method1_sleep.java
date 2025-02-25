class we1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
            try{
            Thread.sleep(2000);
        }
        catch (Exception ee){
            
        }
        }
    }
}



public class threads_method1_sleep {
    public static void main(String[] args) {
        
    
    // creating a thread object 
    we1 oo=new we1();
    oo.start();

    we1 oo1=new we1();
    oo1.start();
    
    
}
}