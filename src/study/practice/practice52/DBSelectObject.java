package study.practice.practice52;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;

public class DBSelectObject {

	public static void main(String[] args) {
		
		//deptno로 조회
		List<Professor> pList = findProfessorListByDeptno(103);
		
		if(pList == null) {
			System.out.println("조회된 데이터가 없다!");
		}
		
		if(pList.size() == 0)
			System.out.println("리스트가 비어있다");
		
		if(pList != null) {
			
			for(Professor p : pList ) {
							System.out.println(p.toString());
			}
			
		}

	}
	
	public static List<Professor> findProfessorListByDeptno(int deptno) {


		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

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
