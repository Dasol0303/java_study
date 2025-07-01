package study.practice.practice54;

public class StudentDTO {

	//student
	int studno;
	String name;
	String id;
	String jumin;
	String birthday;
	String tel;
	int height;
	int weight;
	int deptno1; //기본값 : 0 무조건 숫자다. 무조건 값을 가져야한다.
	//int deptno2; //기본값 : null, Nullable 값이 Null일수도 있다!
	Integer deptno2;
	//Integer -> int 타입의 Wrapper
	int profno;
	
	//score
	int studnoS;
	int total;
	
	//hakjum
	String grade;
	int min_point;
	int max_point;

	
	//필드
	
	public StudentDTO() {}
	
	public StudentDTO(int studno, String name, String id, String jumin, String birthday, String tel,
			int height, int weight, int deptno1, Integer deptno2, int profno, int studnoS, int total, String grade,
			int min_point, int max_point) {
		this.studno = studno;
		this.name = name;
		this.id = id;
		this.jumin = jumin;
		this.birthday = birthday;
		this.tel = tel;
		this.height = height;
		this.weight = weight;
		this.deptno1 = deptno1;
		this.deptno2 = deptno2;
		this.profno = profno;
		this.studnoS = studnoS;
		this.total = total;
		this.grade = grade;
		this.min_point = min_point;
		this.max_point = max_point;
	}



	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getMin_point() {
		return min_point;
	}

	public void setMin_point(int min_point) {
		this.min_point = min_point;
	}

	public int getMax_point() {
		return max_point;
	}

	public void setMax_point(int max_point) {
		this.max_point = max_point;
	}

	//getter setter
	public int getStudno() {
		return studno;
	}

	public void setStudno(int studno) {
		this.studno = studno;
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

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDeptno1() {
		return deptno1;
	}

	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}

	public Integer getDeptno2() {
		return deptno2;
	}

	public void setDeptno2(Integer deptno2) {
		this.deptno2 = deptno2;
	}

	public int getProfno() {
		return profno;
	}

	public void setProfno(int profno) {
		this.profno = profno;
	}

	@Override
	public String toString() {
		return "StudentDTO [studno=" + studno + ", name=" + name + ", total=" + total + ", grade=" + grade + "]\n";
	}



	
	
	
	
	
	
	
	
}
