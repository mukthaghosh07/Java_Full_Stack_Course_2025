import java.io.FileInputStream;
import java.io.IOException;
public class Fileinputstream {
    public static void main(String[] args) throws  IOException {
        FileInputStream fis=new FileInputStream("Hashmap.java");
        int i =fis.read();
        while(i!=-1){
            System.out.print((char)i);
            i=fis.read();
        }
        fis.close();
    }
}
