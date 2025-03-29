

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Program
 */
//@WebServlet("/Program")
public class Program extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String name= request.getParameter("number");
		int number=Integer.parseInt(request.getParameter("number"));
		response.setContentType("text/html");
		PrintWriter pw=	response.getWriter();
		//pw.println("Name Registered is: "+name);
		pw.println(" Table  for: " + number );
		
		
        for (int i = 1; i <= 10; i++) {
            pw.println(number + " × " + i + " = " + (number * i) +"<br>");
        }
		pw.close();
		
		
		
		
		doGet(request, response);
	}

}
