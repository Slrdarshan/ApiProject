package pojo.com;

public class CompanyCls {
  public String name;
   public int[] comno;
  public Object empno;
   
public CompanyCls(String name, int[] comno, Object empno) {
	super();
	this.name = name;
	this.comno = comno;
	this.empno = empno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int[] getComno() {
	return comno;
}

public void setComno(int[] comno) {
	this.comno = comno;
}

public Object getEmpno() {
	return empno;
}

public void setEmpname(Object empno) {
	this.empno = empno;
}
   

   
   
   
}
