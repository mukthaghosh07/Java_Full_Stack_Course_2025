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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name="xyz", urlPatterns="/user2")
public class Program_retrive extends HttpServlet {
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
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html><body>");
        pw.println("<h2>Company Employee Data</h2>");
        pw.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Salary</th></tr>");

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM company");

            while (rs.next()) {
                pw.println("<tr><td>" + rs.getString("id") + "</td><td>" + rs.getString("name") + "</td><td>" + rs.getString("salary") + "</td></tr>");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        pw.println("</table></body></html>");
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
