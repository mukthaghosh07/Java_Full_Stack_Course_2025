
import java.io.DataInputStream;
import java.io.IOException;

public class datainputstream {
    public static void main(String[] args) throws IOException {
        DataInputStream dip=new DataInputStream(System.in);
        System.out.println("enter your father name: ");
        String fn=dip.readLine();
        System.out.println("enter you full name: ");
        String name=dip.readLine();
        System.out.println("your id:" +fn +"\n your name: "+name);

        dip.close();
    }
}