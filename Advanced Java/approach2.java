package firstprog;



/*



so normally in sql if we want to retrive the data then we use the "select" query 
but in this we are going to use the "executeQuery"
com.mysql.cj.jdbc------> package( which is stored in jar files)


ResultSet is also an interface where it store row of the data

rs.next will point the first row of the cursor

*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class approach2 {
    public static void main(String[] args) throws Exception {
        // Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Loading and registering successfu l....");

        // Establishing a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs", "root", "password");
        System.out.println("Connection established");

        // Creating a statement
        Statement st = con.createStatement();
        System.out.println("Statement is created");

        // Creating a table
       
       // st.execute("CREATE TABLE  education3 (id INT PRIMARY KEY, name VARCHAR(20))");
        //st.execute("insert into education3  values(101,'muktha')");
        ResultSet rs= st.executeQuery(" select name,id from education3");
        rs.next();
       int id= rs.getInt(2);
       String name=rs.getString(1);
        System.out.println(" Query got executed successfully");
        System.out.println(" id is:" +id);
        System.out.println(" name: "+name);
        
        
       // System.out.println("Table created !!");

        // Closing resources
        st.close();
        con.close();
    }
}
