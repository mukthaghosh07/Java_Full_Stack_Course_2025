package firstprog;

import java.sql.CallableStatement;
import java.sql.Connection;
//import java.sql.*;
import java.sql.DriverManager;
import java.sql.Types;
import java.io.*;
public class callable_statement
{
public static void main(String arr[])throws Exception
{
Connection con;
//Class.forName("com.mysql.jdbc.Driver");
System.out.println("driver loaded and registered");
Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs", "root", "amp12345");
System.out.println("Connection established");

//step 3

CallableStatement cs=con1.prepareCall("{call pr3(?,?)}");
cs.setInt(1,103);
cs.registerOutParameter(2,Types.VARCHAR); //sql varchar into string
cs.execute();   
String str=cs.getString(2);
System.out.println(" name is "+str);
cs.close();
con1.close();

}
}