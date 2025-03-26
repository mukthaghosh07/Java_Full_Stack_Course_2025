package firstprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



/*
   in day1 we have written program from exceuting and checking this details in sql 
but today we are going to reverse this program  we are going to retrive the details from sql query 
 */
public class prog1 {
    public static void main(String[] args) throws Exception {
        // Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Loading and registering successful....");

        // Establishing a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs", "root", "password");
        System.out.println("Connection established");

        // Creating a statement
        Statement st = con.createStatement();
        System.out.println("Statement is created");

        // Creating a table
      
       // st.execute("CREATE TABLE  education3 (id INT PRIMARY KEY, name VARCHAR(20))");
        st.execute("insert into education3  values(101,'muktha')");
        System.out.println("Table created !!");

        // Closing resources
        st.close();
        con.close();
    }
}
