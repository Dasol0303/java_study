package study.db.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;

public class DepartmentDAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	
	public DepartmentDTO findDepartmentByDeptno(int deptno) {
		
		conn = DBConnectionManager.connectDB();
		
		String query = "select * from department where deptno = ?";
		
		DepartmentDTO departmentDTO = null;

		try {
			psmt = conn.prepareStatement(query);
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();

			if (rs.next()) {
				departmentDTO = new DepartmentDTO();
				
				departmentDTO.setDeptno(rs.getInt("deptno"));
				departmentDTO.setDname(rs.getString("dname"));
				departmentDTO.setPart(rs.getInt("part"));
				departmentDTO.setBuild(rs.getString("build"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}


		return departmentDTO;
	}
	
	

	
}
