package study.practice.practice53;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;

public class StudentDAO {
	
		Connection conn;
		PreparedStatement psmt;
		ResultSet rs;

	//전체 조회
	public List<StudentDTO> findStudentList() {
		

		
		conn = DBConnectionManager.connectDB();
		
		String query = "select studno, name, id, grade, jumin, TO_CHAR(birthday, 'YYYY-MM-DD') birthday, tel, height, weight, deptno1, deptno2, profno from student";
		//변환했으면 별칭 지어주기!!
		List<StudentDTO> studLsit = new ArrayList<StudentDTO>();

		try {
			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();

			while (rs.next()) {
				StudentDTO stud = new StudentDTO();
				
				stud.setStudno(rs.getInt("studno"));
				stud.setName(rs.getString("name"));
				stud.setId(rs.getString("id"));
				stud.setGrade(rs.getInt("grade"));
				stud.setJumin(rs.getString("jumin"));
				stud.setBirthday(rs.getString("birthday"));
				stud.setTel(rs.getString("tel"));
				stud.setHeight(rs.getInt("height"));
				stud.setWeight(rs.getInt("weight"));
				stud.setDeptno1(rs.getInt("deptno1"));
				stud.setDeptno2(rs.getInt("deptno2"));
				stud.setProfno(rs.getInt("profno"));
				
				studLsit.add(stud);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}


		return studLsit;
	}

	
	//학년 조회
	public List<StudentDTO> findStudentListByGrade(int grade) {
			
			conn = DBConnectionManager.connectDB();
			
			String query = "select studno, name, id, grade, jumin, TO_CHAR(birthday, 'YYYY-MM-DD') birthday, tel, height, weight, deptno1, deptno2, profno from student where grade = ?";
			
			List<StudentDTO> studLsit = new ArrayList<StudentDTO>();
	
			try {
				psmt = conn.prepareStatement(query);
				psmt.setInt(1, grade);
				rs = psmt.executeQuery();
	
				while (rs.next()) {
					StudentDTO stud = new StudentDTO();
					
					stud.setStudno(rs.getInt("studno"));
					stud.setName(rs.getString("name"));
					stud.setId(rs.getString("id"));
					stud.setGrade(rs.getInt("grade"));
					stud.setJumin(rs.getString("jumin"));
					stud.setBirthday(rs.getString("birthday"));
					stud.setTel(rs.getString("tel"));
					stud.setHeight(rs.getInt("height"));
					stud.setWeight(rs.getInt("weight"));
					stud.setDeptno1(rs.getInt("deptno1"));
					stud.setDeptno2(rs.getInt("deptno2"));
					stud.setProfno(rs.getInt("profno"));
					
					studLsit.add(stud);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				DBConnectionManager.disconnectDB(conn, psmt, rs);
			}
	
	
			return studLsit;
		}
	
	//데이터 추가
	public int saveStudent(StudentDTO student) {
		conn = DBConnectionManager.connectDB();
		
		String query = "insert into student values ( ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?, ?, ? )";
		
		int result = 0;

		try {
			psmt = conn.prepareStatement(query);
			
			psmt.setInt(1, student.getStudno());
			psmt.setString(2, student.getName());
			psmt.setString(3, student.getId());
			psmt.setInt(4, student.getGrade());
			psmt.setString(5, student.getJumin());
			psmt.setString(6, student.getBirthday());
			psmt.setString(7, student.getTel());
			psmt.setInt(8, student.getHeight());
			psmt.setInt(9, student.getWeight());
			psmt.setInt(10, student.getDeptno1());
			
			//student.getDeptno2() : null
			//psmt.setInt(11, student.getDeptno2());
			if(student.getDeptno2() == null)
				psmt.setNull(11, Types.INTEGER);
			else
				psmt.setInt(11, student.getDeptno2());
			
			psmt.setInt(12, student.getProfno());
				
			result = psmt.executeUpdate();
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}


		return result;
	}

	int[] n;
	
	
}
