package study.db.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBSelectObject {

	public static void main(String[] args) {

//		findDept();
//		findDeptSingle();
		
//		findDeptByDeptno(10);
		
		Dept dept = findDeptByDeptno(20);
		if(dept == null) {
			System.out.println("조회된 데이터가 없다!");
		}
		
		if(dept != null) {
			System.out.println(dept.getDeptno() + " " + dept.getDname() + " " + dept.getLoc());
		}
		
		System.out.println("**************** findDeptList() ****************");
		List<Dept> deptList = findDeptList();
		if(deptList == null) {
			System.out.println("리스트가 없다 = 데이터가 없다");
		}
		
		if(deptList.size() == 0)
			System.out.println("리스트가 비어있다");
		
		if(deptList != null) {
			
			for(Dept d : deptList) {
				System.out.println(d.getDeptno() + " " + d.getDname() + " " + d.getLoc());
			}
			
//			for(int i=0; i<deptList.size(); i++) {
//				Dept d = deptList.get(i);
//			}
		}
		
		System.out.println("*********** findDeptByDname() ***************");
		Dept dept2 = findDeptByDname("RESEARCH");
		if(dept2 != null) {
			System.out.println(dept2.getDeptno() + " " + dept2.getDname() + " " + dept2.getLoc());
		}
		
//		findDeptByDeptno(30);
//		findDeptByDeptno(40);
		
		System.out.println("**************** findDeptListAs() ****************");
		deptList = findDeptListAs();
		for(Dept d : deptList) {
			System.out.println(d.getDeptno() + " " + d.getDname() + " " + d.getLoc());
		}
		
	}
	
	public static void findDept() {
		//OracleDB 연결
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		//DB연결 및 사용시 필요한 객체
		Connection conn = null;	//DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//쿼리 준비
		String query = "select * from dept";
		
		try {
			
			psmt = conn.prepareStatement(query); //쿼리실행 준비객체
			rs = psmt.executeQuery(); 	//쿼리 실행 후 결과 저장
			//테이블 정보가 rs에 들어있다고 생각해..
			
			//ResultSet re 에 담겨져있는 쿼리 수행결과 확인
			while(rs.next()) { //읽어온 데이터를 행 단위로 반복하면서 접근
				//rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false
				
				//컬럼인덱스 / 컬럼명
				//rs.getInt(1)
				
				//해당 행에 컬럼 단위로 데이터 접근
				System.out.println(rs.getInt("DEPTNO"));
				System.out.println(rs.getString("DNAME"));
				System.out.println(rs.getString("LOC"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//DB연결 종료
		
		try {
			
			if(rs != null) {
				rs.close();
			}
			
			if(psmt != null) {
				psmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void findDeptSingle() {
		//OracleDB 연결
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		//DB연결 및 사용시 필요한 객체
		Connection conn = null;	//DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//쿼리 준비
		String query = "select * from dept where deptno = 30";
		
		try {
			
			psmt = conn.prepareStatement(query); //쿼리실행 준비객체
			rs = psmt.executeQuery(); 	
			if (rs.next()) { //읽어올 데이터가 1개만 있는 경우?
				//해당 행에 컬럼 단위로 데이터 접근
				System.out.println(rs.getInt("DEPTNO"));
				System.out.println(rs.getString("DNAME"));
				System.out.println(rs.getString("LOC"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//DB연결 종료
		
		try {
			
			if(rs != null) {
				rs.close();
			}
			
			if(psmt != null) {
				psmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void findDept1() {
		//OracleDB 연결
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		//DB연결 및 사용시 필요한 객체
		Connection conn = null;	//DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//쿼리 준비
		String query = "select * from dept";
		
		try {
			
			psmt = conn.prepareStatement(query); //쿼리실행 준비객체
			rs = psmt.executeQuery(); 	//쿼리 실행 후 결과 저장
			//테이블 정보가 rs에 들어있다고 생각해..
			
			//ResultSet re 에 담겨져있는 쿼리 수행결과 확인
			while(rs.next()) {
				//읽어온 데이터를 행 단위로 반복하면서 접근
				//rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false
				
				//컬럼인덱스 / 컬럼명
				//rs.getInt(1)
				
				//해당 행에 컬럼 단위로 데이터 접근
				System.out.println(rs.getInt("DEPTNO"));
				System.out.println(rs.getString("DNAME"));
				System.out.println(rs.getString("LOC"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//DB연결 종료
		
		try {
			
			if(rs != null) {
				rs.close();
			}
			
			if(psmt != null) {
				psmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//public static void findDeptByDname() {
	public static Dept findDeptByDeptno(int deptno) {
		//OracleDB 연결
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		//DB연결 및 사용시 필요한 객체
		Connection conn = null;	//DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//쿼리 준비
		
		
		String query = "select * from dept where deptno = ? "; 
		//String query = "select * from dept where deptno = " + deptno; 
					//이렇게 문자열로 쓰는 거 X!! -> 악의적인 이용 방지 위해서
		
		Dept dept = null;
		
		try {
			
			psmt = conn.prepareStatement(query); //쿼리실행 준비객체
			
			//파라미터 세팅
			psmt.setInt(1,  deptno); //쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다
			
			//물음표가 3개일때!
//			psmt.setInt(2,  "1231");
//			psmt.setInt(1,  21311);
			
			rs = psmt.executeQuery(); 	
			
			
			if (rs.next()) { //읽어올 데이터가 1개만 있는 경우?
				
				dept = new Dept(); //초기화
		
				dept.setDeptno(rs.getInt("DEPTNO"));
				dept.setDname(rs.getString("DNAME"));
				dept.setLoc(rs.getString("LOC"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//DB연결 종료
		
		try {
			
			if(rs != null) {
				rs.close();
			}
			
			if(psmt != null) {
				psmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dept;
	}
	
	
	public static Dept findDeptByDname(String dname) {
		// OracleDB 연결More actions
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// DB연결정보
				String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String db_id = "scott";
				String db_pw = "tiger";

				// DB연결 및 사용시 필요한 객체
				Connection conn = null; // DB 연결 객체
				PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
				ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

				// DB 연결
				try {
					conn = DriverManager.getConnection(db_url, db_id, db_pw);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// 쿼리 준비

				String query = "select * from dept where dname = ? ";		

				
				Dept dept = null; 
				
				try {

					psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
					 
					//파라미터 세팅
					psmt.setString(1, dname); //쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다
					
					rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

					// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
					if(rs.next()) { // 읽어올 데이터가 1개만 있는 경우?
						
						dept = new Dept();
						
						dept.setDeptno(rs.getInt("DEPTNO"));
						dept.setDname(rs.getString("DNAME"));
						dept.setLoc(rs.getString("LOC"));
						
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// DB연결 종료
				try {

					if (rs != null)
						rs.close();

					if (psmt != null)
						psmt.close();

					if (conn != null) {
						conn.close();
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				return dept;
	}
	//요거 못 들음!! 이따 선생님꺼 가져와야함!!!!
	
	
	//findDeptAll(전체 다 찾기!)
	public static List<Dept> findDeptList() {
		//OracleDB 연결
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		//DB연결 및 사용시 필요한 객체
		Connection conn = null;	//DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//쿼리 준비
		String query = "select * from dept where 1=2";
		
		//List<Dept> deptList = null;
		
		List<Dept> deptList = new ArrayList<Dept>();
		
		try {
			
			psmt = conn.prepareStatement(query); //쿼리실행 준비객체
			rs = psmt.executeQuery(); 	//쿼리 실행 후 결과 저장
			
			
			//ResultSet re 에 담겨져있는 쿼리 수행결과 확인
			while(rs.next()) { //rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false
				
				
				//null인 경우의 if문을 만들어두어야 반복하면서 초기화되는 것을 막아줌!!
//				if(deptList == null) {
//					deptList = new ArrayList<Dept>();
//				}
				
				
				//해당 행에 컬럼 단위로 데이터 접근
				Dept dept = new Dept(rs.getInt("DEPTNO"), rs.getString("DNAME"), rs.getString("LOC"));
				deptList.add(dept); //위에 만든 거 담아주기!!
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//DB연결 종료
		
		try {
			
			if(rs != null) {
				rs.close();
			}
			
			if(psmt != null) {
				psmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return deptList;
	}
	
	
	public static List<Dept> findDeptListAs() {
		//OracleDB 연결
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		//DB연결 및 사용시 필요한 객체
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//쿼리 준비
		String query = "select deptno dpno, dname dnme from dept"; 
		//별칭을 정해줬으면 별칭으로 접근하기!!
		
		List<Dept> deptList = new ArrayList<Dept>();
		
		try {
			
			psmt = conn.prepareStatement(query); //쿼리실행 준비객체
			rs = psmt.executeQuery(); 	//쿼리 실행 후 결과 저장

			while(rs.next()) {
				
				//해당 행에 컬럼 단위로 데이터 접근
				Dept dept = new Dept(rs.getInt("dpno"), rs.getString("dnme"), null);
				deptList.add(dept);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB연결 종료
		
		try {
			
			if(rs != null) {
				rs.close();
			}
			
			if(psmt != null) {
				psmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return deptList;
	}
	
	
	

}




