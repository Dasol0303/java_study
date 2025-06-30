package study.db.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v1.Dept;
import study.db.v2.DBConnectionManager;

public class DeptDAO {

	//DAO(Data Access Object) -> 데이터에 접근하는 것
	
	//필드변수 따로 빼주고 기존 로직에서 지워주기 -> 기본적으로 null로 세팅해주기 때문에 따로 적어줄 필요 X
	Connection conn = DBConnectionManager.connectDB();
	PreparedStatement psmt;
	ResultSet rs;

	
		public Dept findDeptByDeptno(int deptno) {

			conn = DBConnectionManager.connectDB();

			// 쿼리 준비
			//String query = "select * from dept where deptno = ? ";
			String query = "select * from new_dept where deptno = ? ";
			Dept dept = null;

			try {
				psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

				// 파라미터 세팅
				psmt.setInt(1, deptno); // 쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다
				rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

				if (rs.next()) { // 읽어올 데이터가 1개만 있는 경우?
					dept = new Dept();
					dept.setDeptno(rs.getInt("DEPTNO"));
					dept.setDname(rs.getString("DNAME"));
					dept.setLoc(rs.getString("LOC"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			DBConnectionManager.disconnectDB(conn, psmt, rs);

			return dept;
		}

		public Dept findDeptByDname(String dname) {


			conn = DBConnectionManager.connectDB();

			// 쿼리 준비

			String query = "select * from dept where dname = ? ";

			Dept dept = null;

			try {

				psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

				// 파라미터 세팅
				psmt.setString(1, dname); // 쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다

				rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

				// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
				if (rs.next()) { // 읽어올 데이터가 1개만 있는 경우?

					dept = new Dept();

					dept.setDeptno(rs.getInt("DEPTNO"));
					dept.setDname(rs.getString("DNAME"));
					dept.setLoc(rs.getString("LOC"));

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			DBConnectionManager.disconnectDB(conn, psmt, rs);

			return dept;
		}

		public List<Dept> findDeptList() {

			conn = DBConnectionManager.connectDB();

			// 쿼리 준비
			String query = "select * from dept";

			// List<Dept> deptList = null;
			List<Dept> deptList = new ArrayList<Dept>();

			try {

				psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
				rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

				// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
				while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
					// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false

					// 컬럼인덱스 / 컬럼명
					// rs.getInt(1)

//					if(deptList == null)
//						deptList = new ArrayList<Dept>();

					// 해당 행에 컬럼 단위로 데이터 접근
					Dept dept = new Dept(rs.getInt("DEPTNO"), rs.getString("DNAME"), rs.getString("LOC"));
					deptList.add(dept);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			DBConnectionManager.disconnectDB(conn, psmt, rs);

			return deptList;
		}
		
		//insert
		public int saveDept(int deptno, String dname, String loc) {
			conn = DBConnectionManager.connectDB();

			String query = "INSERT INTO new_dept VALUES ( ?, ?, ? ) "; 
			
			int result = 0;
			
			try {

				psmt = conn.prepareStatement(query);

				psmt.setInt(1,  deptno);
				psmt.setString(2,  dname);
				psmt.setString(3,  loc);

				//rs = psmt.executeQuery(); : select시 사용 -> return ResultSet (조회결과 데이터)	
				result = psmt.executeUpdate();
				//psmt.executeUpdate(); : inset, update, delete 사용 -> return int (적용된 행의 수)

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBConnectionManager.disconnectDB(conn, psmt, rs);
			}

			return result;
		}
		
		//insert
		public int saveDept(Dept dept) {
			conn = DBConnectionManager.connectDB();

			String query = "INSERT INTO new_dept VALUES ( ?, ?, ? ) "; 
			
			int result = 0;
			
			try {

				psmt = conn.prepareStatement(query);

				psmt.setInt(1,  dept.getDeptno());
				psmt.setString(2,  dept.getDname());
				psmt.setString(3,  dept.getLoc());

				//rs = psmt.executeQuery(); : select시 사용 -> return ResultSet (조회결과 데이터)	
				result = psmt.executeUpdate();
				//psmt.executeUpdate(); : inset, update, delete 사용 -> return int (적용된 행의 수)

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBConnectionManager.disconnectDB(conn, psmt, rs);
			}

			return result;
		}
		
		//update
		public int modifyDept(Dept dept) {
			conn = DBConnectionManager.connectDB();

			String query = "UPDATE new_dept "
						+ " SET dname = ?, loc = ?"
						+ " WHERE deptno = ?"; 
			
			int result = 0;
			
			try {

				psmt = conn.prepareStatement(query);
				
				psmt.setString(1,  dept.getDname());
				psmt.setString(2,  dept.getLoc());
				psmt.setInt(3,  dept.getDeptno());
			
				result = psmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBConnectionManager.disconnectDB(conn, psmt, rs);
			}

			return result;
		}
		
		//delete
		public int removeDept(int deptno) {
			conn = DBConnectionManager.connectDB();

			String query = "DELETE new_dept "
						+ " WHERE deptno = ?"; 
			
			int result = 0;
			
			try {

				psmt = conn.prepareStatement(query);
				
				psmt.setInt(1,  deptno);

				result = psmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBConnectionManager.disconnectDB(conn, psmt, rs);
			}

			return result;
		}
	
		public int removeDept(Dept dept) {
			int deptno = dept.getDeptno();
			return removeDept(deptno);
		}
	
	
}
