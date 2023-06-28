package P.com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Selectdata extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root",
					"root");
			PreparedStatement ps = con.prepareStatement("select * from empdata where id = ?");

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			rs.next();

			String fname = rs.getString("First Name");
			String lname = rs.getString("Last Name");
			String email = rs.getString("Email");
			String ap = rs.getString("Address");
			String pin = rs.getString("Pincode");

			EmployeeData employee = new EmployeeData(fname, lname, email, ap, pin);
		request.setAttribute("employee", employee);

			System.out.println(rs);
			System.out.println(rs.getString("id"));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		

		

		RequestDispatcher rd = request.getRequestDispatcher("Singledata.jsp");
		rd.forward(request, response);

	}

}
