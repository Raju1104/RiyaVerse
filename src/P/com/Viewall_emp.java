package P.com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Viewall_emp extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from empdata");

			ResultSet rs = ps.executeQuery();

			ArrayList<EmployeeData> arraylist = new ArrayList<EmployeeData>();

			while (rs.next()) {

				String fname = rs.getString("First Name");
				String lname = rs.getString("Last Name");
				String email = rs.getString("Email");
				String ap = rs.getString("Address");
				String pin = rs.getString("Pincode");

				EmployeeData employee = new EmployeeData(fname, lname, email, ap, pin);
				arraylist.add(employee);
			}

			req.setAttribute("empList", arraylist);

			RequestDispatcher rd = req.getRequestDispatcher("viewall.jsp");
			rd.forward(req, res);

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
