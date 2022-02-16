package pojo.com;

public class commanPojo_cls {

	public String name;
	public String empid;
	public int phno;
	public String email;
	
	public commanPojo_cls(String name, String empid,int phno ,String email) {
		this.name=name;
		this.empid=empid;
		this.phno=phno;
		this.email=email;
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
	
	
	
	
	
}
