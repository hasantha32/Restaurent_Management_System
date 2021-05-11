package models;

public class Feedback {
	
	private int fid;
	private String firstname;
	private String lastName;
	private String email;
	private String message;
	
	public Feedback(String firstname, String lastName, String email, String message) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.message = message;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}
