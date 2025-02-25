
class oq extends Thread{
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

public class thread_method2_join {
    public static void main(String[] args) {
        oq ii= new oq();
        ii.start();
        try{
            ii.join();
        }
        catch (Exception ee){

        }
        oq ii1= new oq();
        ii1.start();
      

    }
}
