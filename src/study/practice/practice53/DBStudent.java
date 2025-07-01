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


		System.out.println("=================데이터 추가=================");
		
		//1)
		StudentDTO studDTO = new StudentDTO();
		/*
		studDTO.setStudno(8002);
		studDTO.setName("name");
		studDTO.setId("Id");
		studDTO.setGrade(5);
		studDTO.setJumin("123456789101");
		studDTO.setBirthday("20000531");
		studDTO.setTel("02)111-2222");
		studDTO.setHeight(250);
		studDTO.setWeight(90);
		studDTO.setDeptno1(101);
		studDTO.setDeptno2(101);
		studDTO.setProfno(4567);
		

		int rs = studDAO.saveStudent(studDTO);
		if(rs > 0) {
			System.out.println("저장완료");
		}
		
		
		//2)
		
		StudentDTO saveS2 = new StudentDTO (9000, "Yahod", "A5dd5", 4, "0005313456788", "20000530", "02)501-2222", 
				200, 90, 101, 0, 1012);
		int rs2 = studDAO.saveStudent(saveS2);
		if(rs2 > 0) {
			System.out.println("저장완료");
		}
		*/
		
		
		//3) - null
		StudentDTO studDTO3 = new StudentDTO();

		studDTO.setStudno(8586);
		studDTO.setName("neeme2gs");
		studDTO.setId("Ighfg");
		studDTO.setGrade(5);
		studDTO.setJumin("123456789456");
		studDTO.setBirthday("20000531");
		//studDTO.setTel("02)111-2223");
		studDTO.setTel(null);
		studDTO.setHeight(250);
		studDTO.setWeight(90);
		studDTO.setDeptno1(102);
		studDTO.setDeptno2(null);
		studDTO.setProfno(4565);
		
		int rs3 = studDAO.saveStudent(studDTO3);
		
		List<StudentDTO> list;
		//List<int> list2;
		List<Integer> list2; //가능
		
		if(rs3 > 0) {
			System.out.println("저장완료");
		}


	}

}
