package study.db.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.practice.practice52.Professor;

public class ProfessorDAO {
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	public int saveProfessor(ProfessorDTO professor) {
		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		String query = "insert into professor values (?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?)";
		//String을 TO_DATE바꾸어주는 형태로 String 사용가능
		
		int result = 0;

		try {

			psmt = conn.prepareStatement(query);
			psmt.setInt(1, professor.getProfno());
			psmt.setString(2, professor.getName());
			psmt.setString(3, professor.getId());
			psmt.setString(4, professor.getPosition());
			psmt.setInt(5, professor.getPay());
			//date <-> timewstamp
			//getDate getTimestamp
			
			//LocalDateTime -> timestamp
			//psmt.setTimestamp(6, 
			//		ConvertDateUtil.convertLocalDateTimeToTimestamp(professor.getHiredate()));
			psmt.setString(6,  professor.getHiredate());
			
			psmt.setInt(7, professor.getBonus());
			psmt.setInt(8, professor.getDeptno());
			psmt.setString(9, professor.getEmail());
			psmt.setString(10, professor.getHpage());
			
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return result;
	}
	
	public ProfessorDTO findProfessorByProfno(int profno) {
		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		String query = "select profno, name, id, position, pay,"
				+ " TO_CHAR(hiredate, 'YYYY-MM-DD'), hiredate, bonus, deptno, email, hpate"
				+ " from professor where profno = ?";
		//선택에 문자로 변환해서 사용하면 String으로 사용가능
		
		ProfessorDTO professor = null;

		try {

			psmt = conn.prepareStatement(query);
			psmt.setInt(1, profno);
			rs = psmt.executeQuery();
			
			while (rs.next()) {

				professor = new ProfessorDTO();
				professor.setProfno(rs.getInt("profno"));
				professor.setName(rs.getString("name"));
				professor.setId(rs.getString("Id"));
				professor.setPosition(rs.getString("position"));
				professor.setPay(rs.getInt("pay"));
				
				//rs.getDate("hiredate").toLocalDate()
				//rs.getTimestamp("hiredate");
				
				//sql.date, util.date, localdate, localdateTime, timestamp
				
				//professor.setHiredate(rs.getDate("hiredate"));
				// setHiredate(LocalDateTme)	rs.getDate("hiredate") java.sql.Date
				
				//professor.setHiredate(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("hiredate")));
				professor.setHiredate(rs.getString("hiredate"));
				
				professor.setBonus(rs.getInt("bonus"));
				professor.setDeptno(rs.getInt("deptno"));
				professor.setEmail(rs.getString("email"));
				professor.setHpage(rs.getString("hpage"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return professor;
	}
	

	public List<Professor> findProfessorListByDeptno(int deptno) {

		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		String query = "select profno, name, id, position, pay, deptno "
				+ "from professor where deptno = ?";
		//deptno로 조회
		
		List<Professor> professorList = new ArrayList<Professor>();

		try {

			psmt = conn.prepareStatement(query);
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();
			
			while (rs.next()) {

				Professor p = new Professor(
						rs.getInt("profno"),
						rs.getString("name"),
						rs.getString("id"),
						rs.getString("position"),
						rs.getInt("pay"),
						rs.getInt("deptno"));
				professorList.add(p);
				

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return professorList;
	}
	
}
