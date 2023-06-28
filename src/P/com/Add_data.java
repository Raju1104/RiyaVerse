package P.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add_data extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String fname = req.getParameter("First name");
		String lname = req.getParameter("Last name");
		String email = req.getParameter("Email");
		String ap = req.getParameter("Address");
		String pin = req.getParameter("Pincode");

		req.setAttribute("First name", fname);
		req.setAttribute("Last name", lname);
		req.setAttribute("Email", email);
		req.setAttribute("Address", ap);
		req.setAttribute("Pincode", pin);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "root");

			PreparedStatement ps = con.prepareStatement(
					"insert into empdata(`First Name`,`Last Name`,`Email`,Address,Pincode) values(?,?,?,?,?)");

			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, ap);
			ps.setString(5, pin);

			int result = ps.executeUpdate();
			System.out.println(result);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		res.setContentType("text/html");
		
PrintWriter pw = res.getWriter();
pw.write("<h1>Employee Data Added Successfully....</h1>");
	}
}
