package P.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

public class Singledata extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "root");

			PreparedStatement ps = con.prepareStatement("Select * from empdata where id = ?");

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			rs.next();
			
			req.setAttribute("id", rs.getInt(1));
			req.setAttribute("Firstname", rs.getString(2));
			req.setAttribute("Lastname", rs.getString(3));
			req.setAttribute("Email", rs.getString(4));
			req.setAttribute("Address", rs.getString(5));
			req.setAttribute("Pincode", rs.getString(6));

			RequestDispatcher rd = req.getRequestDispatcher("get.jsp");
			rd.forward(req, res);

			System.out.println(rs);

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
