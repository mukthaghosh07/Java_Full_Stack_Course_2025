import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class firstprog {

    public static void main(String[] args) throws Exception
    {
Class.forName("com.cj.mysql.jdbc.Driver");
        System.out.println("loading and registering successful....");

        // to get connections
Connection  con= DriverManager.getConnection("jdbc:mysql:localhost/jfs", "root", "password");

        // creating a connections
Statement st= con.createStatement();
        System.out.println("statement is created");

        st.execute("create table education(id int,name varchar(20))");
        System.out.println("Table created !!");


    con.close();
    st.close();

     
        
    }
}
