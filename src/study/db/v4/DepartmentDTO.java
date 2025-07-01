package study.db.v4;

public class DepartmentDTO {

	int deptno;
	String dname;
	int part;
	String build;
	
	
	
	public DepartmentDTO() {}
	
	public DepartmentDTO(int deptno, String dname, int part, String build) {
		this.deptno = deptno;
		this.dname = dname;
		this.part = part;
		this.build = build;
	}


	
	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public int getPart() {
		return part;
	}


	public void setPart(int part) {
		this.part = part;
	}


	public String getBuild() {
		return build;
	}


	public void setBuild(String build) {
		this.build = build;
	}


	
	@Override
	public String toString() {
		return "DepartmentDTO [deptno=" + deptno + ", dname=" + dname + ", part=" + part + ", build=" + build + "]";
	}
	
	
	
	
	
}
