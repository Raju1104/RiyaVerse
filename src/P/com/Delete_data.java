package P.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Delete_data extends HttpServlet {
	
	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		int a = Integer.parseInt(req.getParameter("Id"));
	

		req.setAttribute("Id", a);
	

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "root");

			PreparedStatement ps = con.prepareStatement("Delete from empdata where Id = ?");
				

			ps.setInt(1, a);
		

			int result = ps.executeUpdate();
			System.out.println(result);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		res.setContentType("text/html");
		
PrintWriter pw = res.getWriter();
pw.write("<h1>Employee Data Deleted Successfully....</h1>");
	}
	}
	
	
	
	


