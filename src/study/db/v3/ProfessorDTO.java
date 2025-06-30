package study.db.v3;

import java.sql.Date;
import java.time.LocalDateTime;

public class ProfessorDTO {
	int profno;
	String name;
	String id;
	String position;
	int pay;
	
	//java.sql.Date  : DB와 연동되는 타입
	//java.util.Date  : Java에서 자체적으로 사용하는 타입 -> LocalDate, LocalDateTime
	
	//sql.date <-> LocalDateTime, String
	//Date hiredate;
	//LocalDateTime hiredate;
	String hiredate;
	int bonus;
	int deptno;
	String email;
	String hpage;

	
	public ProfessorDTO() {}
	
	public ProfessorDTO(int profno, String name, String id, String position, int pay, String hiredate, int bonus,
			int deptno, String email, String hpage) {
		this.profno = profno;
		this.name = name;
		this.id = id;
		this.position = position;
		this.pay = pay;
		this.hiredate = hiredate;
		this.bonus = bonus;
		this.deptno = deptno;
		this.email = email;
		this.hpage = hpage;
	}

	
	public int getProfno() {
		return profno;
	}

	public void setProfno(int profno) {
		this.profno = profno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHpage() {
		return hpage;
	}

	public void setHpage(String hpage) {
		this.hpage = hpage;
	}

	@Override
	public String toString() {
		return "ProfessorDTO [profno=" + profno + ", name=" + name + ", id=" + id + ", position=" + position + ", pay="
				+ pay + ", hiredate=" + hiredate + ", bonus=" + bonus + ", deptno=" + deptno + ", email=" + email
				+ ", hpage=" + hpage + "]";
	}

	

	
	
	

}
