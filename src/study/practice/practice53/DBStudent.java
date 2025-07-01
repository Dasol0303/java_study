package study.practice.practice53;

import java.util.List;


public class DBStudent {

	public static void main(String[] args) {
		//전체 조회
		System.out.println("=================전체 조회=================");
		
		StudentDAO studDAO = new StudentDAO();
		
		List<StudentDTO> studLsit = studDAO.findStudentList();
		for(StudentDTO sd : studLsit) {
			System.out.println(sd);
		}
		
		System.out.println("=================학년 조회=================");
		
		//학년을 받아서 조회
		List<StudentDTO> sd = studDAO.findStudentListByGrade(1);
		System.out.println(sd);
		

	}

}
