package study.db.v4;

public class DBMain {

	public static void main(String[] args) {

		
		//student 테이블
		//department 테이블
		//두개를 조인해서 조회해야 하는 경우
		
		//1) 조회 데이터를 조회 조건으로 활용해서, 각자 조회
		
		int pk = 9511; //studno
		
		StudentDAO studentDAO = new StudentDAO();
		StudentDTO student = studentDAO.findStudentByStudno(pk);
		
		System.out.println(student);
		
		//department 조회 -> deptno pk 조회 기준값
		//student deptno1 -> department deptno
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentDTO departmentDTO = departmentDAO.findDepartmentByDeptno(student.getDeptno1());
		System.out.println(departmentDTO);
		
		
		//2) 조인으로 한번에 커다란 DTO를 활용해서 조회
		StudentMypageDTO smDTO = studentDAO.findStudentMypageInfoByStudno(9511);
		System.out.println(smDTO);
		
	}

}
