package study.db.v1;



//DB 테이블에서 읽어온 데이터를 저장하는 역할
//DTO (Data Transfer Object)
public class Dept {  //DeptDTO
	
	int deptno;
	String dname;
	String loc;
	
	public Dept() {}
	
	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	

}




