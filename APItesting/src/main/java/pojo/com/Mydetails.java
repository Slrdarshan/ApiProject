package pojo.com;

public class Mydetails {

	String name;
	String empid;
	int phno;
	Object spouse;
	
	public Mydetails(String name, String empid, int phno, Object spouse) {
		this.name=name;
		this.empid=empid;
		this.phno=phno;
		this.spouse=spouse;		
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

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	
	
	
	
	
}
