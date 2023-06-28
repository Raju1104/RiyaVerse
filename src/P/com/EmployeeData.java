package P.com;

public class EmployeeData {

	private String fname;
	private String lname;
	private String email;
	private String ap;
	private String pin;

	public EmployeeData() {

	}

	public EmployeeData(String fname, String lname, String email, String ap, String pin) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.ap = ap;
		this.pin = pin;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	

}
