package firstprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableResultSet {

public static void main(String arr[])throws Exception
{

Statement st;
Connection con;
ResultSet rs;
//Class.forName("com.mysql.jdbc.Driver");
//System.out.println("driver loaded and registered");
Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs", "root", "password");
System.out.println("Connection established");
st=con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
rs=st.executeQuery("select * from company");


rs.first();
int i=rs.getInt(1);
String ss=rs.getString(2);
System.out.println("id no is"+i);
System.out.println("name is"+ss);


rs.absolute(3);
int ii=rs.getInt(1);
String s=rs.getString(2);
System.out.println("id no is"+ii);
System.out.println("name is"+s);


rs.previous();
int ij1=rs.getInt(1);
String sss1=rs.getString(2);
System.out.println("id no is"+ij1);
System.out.println("name is"+sss1);


rs.next();
int ij=rs.getInt(1);
String sss=rs.getString(2);
System.out.println("id no is"+ij);
System.out.println("name is"+sss);


rs.last();
int ij2=rs.getInt(1);
String sss2=rs.getString(2);
System.out.println("id no is"+ij2);
System.out.println("name is"+sss2);



rs.close();
st.close();
con1.close();


}}
