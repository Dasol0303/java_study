package study.practice.practice52;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectManager {
	public static Connection connectDB() {

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

		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	public static void disconnectDB(Connection conn, PreparedStatement psmt, ResultSet rs) {
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
}
