package pojo.com;

public class CommanPojoForNumberObject {
	
	String name;
	String empid;
	int phno;
	String email;
	int[] number;
	
	public CommanPojoForNumberObject(String name, String empid, int phno, String email, int[] number) {
		super();
		this.name = name;
		this.empid = empid;
		this.phno = phno;
		this.email = email;
		this.number = number;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int[] getNumber() {
		return number;
	}

	public void setNumber(int[] number) {
		this.number = number;
	}
	
	
	
	
	

}
