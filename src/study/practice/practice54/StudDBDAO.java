package study.practice.practice54;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.practice.practice54.StudentDTO;

public class StudDBDAO {


	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	//전체 조회
	public List<StudentDTO> findStudentScore() {

		conn = DBConnectionManager.connectDB();

		String query = "select * "
					+ " from score sc, hakjum h, student s "
					+ " where s.studno = sc.studno "
					+ " AND sc.total BETWEEN h.min_point AND h.max_point "
					+ " order by total desc ";
		//변환했으면 별칭 지어주기!!
		List<StudentDTO> studList = new ArrayList<StudentDTO>();

		try {
			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();

			while (rs.next()) {
				StudentDTO stud = new StudentDTO();

				//student
				stud.setStudno(rs.getInt("studno"));
				stud.setName(rs.getString("name"));
				stud.setId(rs.getString("id"));
				stud.setJumin(rs.getString("jumin"));
				stud.setBirthday(rs.getString("birthday"));
				stud.setTel(rs.getString("tel"));
				stud.setHeight(rs.getInt("height"));
				stud.setWeight(rs.getInt("weight"));
				stud.setDeptno1(rs.getInt("deptno1"));
				stud.setDeptno2(rs.getInt("deptno2"));
				stud.setProfno(rs.getInt("profno"));
				
				//score
				stud.setStudno(rs.getInt("studno"));
				stud.setTotal(rs.getInt("total"));
				
				//hakjum
				stud.setGrade(rs.getString("grade"));
				stud.setMin_point(rs.getInt("min_point"));
				stud.setMax_point(rs.getInt("max_point"));
				
				studList.add(stud);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}


		return studList;
	}


}
