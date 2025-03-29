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
/**
 * Servlet implementation class Program2
 */
@WebServlet("/Program2")
public class Program2 extends HttpServlet {
     Connection con;
     Statement st;
     PreparedStatement pwt;
    public void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs", "root", "amp12345");
        } catch (Exception e) {
            e.printStackTrace();
        }}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("number");
        response.setContentType("text/html");
        try {
        		//PrintWriter pw = response.getWriter();
        	pwt = con.prepareStatement("INSERT INTO company(id, name) VALUES(?, ?)");
				pwt.setInt(1, 123);  
        		pwt.setString(2, name);

            pwt.executeUpdate();  
        }
         catch (SQLException e) {
            e.printStackTrace();
        }}
    public void destroy()
    {
    try{
    con.close();
    st.close();
    }catch(Exception r)
    {
    System.out.println(r); } }
}
