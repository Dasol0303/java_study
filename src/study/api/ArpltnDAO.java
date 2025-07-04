package study.api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.db.v2.DBConnectionManager;

public class ArpltnDAO {

	/*

	  CREATE TABLE MINU_DUST_WEEK (
	  	id NUMBER PRIMARY KEY,
	  	total_count NUMBER,
	  	frcst_one_cn VARCHAR2(4000),
	  	frcst_two_cn VARCHAR2(4000),
	  	frcst_one_dt VARCHAR2(10),
	  	frcst_two_dt VARCHAR2(10),
	  	presnatnDT VARCHAR2(10)
	  )

	  CREATE SEQUENCE SEQ_MINU_DUST_WEEK_PK
		START WITH 1
		INCREMENT BY 1
		NOCYCLE;
	 */
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	public int saveMinuDustWeek(MinuDustWeekDTO mdwDTO) {
		conn = DBConnectionManager.connectDB();

		String query = "INSERT INTO MINU_DUST_WEEK "
					+ "VALUES ( SEQ_MINU_DUST_WEEK_PK.nextval, ?, ?, ?, ?, ?, ? ) "; 
		
		int result = 0;
		
		try {

			psmt = conn.prepareStatement(query);

			psmt.setInt(1, mdwDTO.getTotalCount());
			psmt.setString(2, mdwDTO.getFrcstOneCn());
			psmt.setString(3, mdwDTO.getFrcstTwoCn());
			psmt.setString(4, mdwDTO.getFrcstOneDt());
			psmt.setString(5, mdwDTO.getFrcstTwoDt());
			psmt.setString(6, mdwDTO.getPresnatnDT());
			
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
	
	
}
