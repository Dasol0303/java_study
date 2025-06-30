package study.db.v3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.practice.practice51.Product;

public class ProductDAO {
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	
	public ProductDTO findProductByPcode(int p_code) {
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "select * from product where p_code = ? ";		
		
		ProductDTO productDTO = null; 
		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			 
			//파라미터 세팅
			psmt.setInt(1, p_code); //쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다
			
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			if(rs.next()) { // 읽어올 데이터가 1개만 있는 경우?
				
				productDTO = new ProductDTO();
				
				productDTO.setP_code(rs.getInt("p_code"));
				productDTO.setP_name(rs.getString("p_name"));
				productDTO.setP_price(rs.getInt("p_price"));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return productDTO;
	}
	
	
	public List<ProductDTO> findProductList() {
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "select * from product";

		List<ProductDTO> productList = new ArrayList<ProductDTO>();
		
		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장
			
			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false

				// 컬럼인덱스 / 컬럼명
				// rs.getInt(1)
				
//				if(deptList == null)
//					deptList = new ArrayList<Dept>();
				
				// 해당 행에 컬럼 단위로 데이터 접근
				ProductDTO productDTO = new ProductDTO(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
				productList.add(productDTO);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		
		return productList;
	}
	

	
}
