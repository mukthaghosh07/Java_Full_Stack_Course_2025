package firstprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class batch_update {
	
	public static void main(String[] args) throws Exception {
		//Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs", "root", "password");
		System.out.println("conncetion is created");
		
	Statement st=con1.createStatement();
	st.addBatch("insert into company values(107,'wipro',484878)");
	st.addBatch("insert into company values(108,'amazon',5465346)");
	st.addBatch("insert into company values(109,'Samsung',63622)");
	st.addBatch("insert into company values(110,'Goldmach sachs',36562)");
	st.addBatch("insert into company values(111,'hcl',536536)");
	
	
	int arr1[]=st.executeBatch();
	System.out.println(" Number of row updated is: "+arr1.length);
	
		
	st.close();
	con1.close();
	
	}

}
