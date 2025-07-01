package study.practice.practice54;

import java.util.List;

public class DBMainStudScoreHakjum {

	public static void main(String[] args) {

		StudDBDAO studDAO = new StudDBDAO();
		
		List<StudentDTO> smDTO = studDAO.findStudentScore();
		System.out.println(smDTO);

	}

}
