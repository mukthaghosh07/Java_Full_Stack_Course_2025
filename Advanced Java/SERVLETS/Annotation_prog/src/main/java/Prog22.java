import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name="abc", urlPatterns="/user1")
public class Prog22 extends HttpServlet {
     Connection con;
     Statement st;
     PreparedStatement pwt;
     
    public void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs", "root", "amp12345");
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("val");
        String id = request.getParameter("val1");
        String salary = request.getParameter("val2");
        response.setContentType("text/html");
        try {
        		//PrintWriter pw = response.getWriter();
        	pwt = con.prepareStatement("INSERT INTO company(id, name,salary) VALUES(?, ?,?)");
				pwt.setString(1, id);  
        		pwt.setString(2, name);
        		pwt.setString(3, salary);
            pwt.executeUpdate();  
        }
         catch (SQLException e) {
            e.printStackTrace();
        }
        
    PrintWriter pw=response.getWriter();
    pw.println("data inserted successfully");
    }
    
    
    
    public void destroy()
    {
    try{
    con.close();
    st.close();
    }catch(Exception r)
    {
    System.out.println(r);
    }
    }
}
