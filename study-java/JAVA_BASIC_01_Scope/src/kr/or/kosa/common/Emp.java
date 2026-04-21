package kr.or.kosa.common;

// DTO (사원 한명의 데이터를 담을 수 있는 클래스) 
// VO(Value Object) 
// DOMAIN 
// Emp e1 = new Emp();
// e2.setEmpno(9999);
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int sal;
	
	// 마우스 오른쪽 > Source > Generate getter and setter 
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	// 간접할당 
	
}
