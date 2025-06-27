package study.practice.practice51;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v1.Dept;

public class Pracitce51 {

	public static void main(String[] args) {

		System.out.println("******************1번*****************");
		Product product = findproductByPCode(101);
		if(product == null) {
			System.out.println("null");
		}
		if(product != null) {
				System.out.println(
						product.getP_code() + " " + 
						product.getP_name() + " " + 
						product.getP_price());
		}
		
		
		System.out.println("******************2번*****************");
		
		List<Product> productList = findproduct(101);
		if(productList == null) {
			System.out.println("null");
		}
		if(productList != null) {
			for(Product p : productList) {
				System.out.println(
						p.getP_code() + " " + 
						p.getP_name() + " " + 
						p.getP_price());
			}
		}
		
		
	}
	
	public static Product findproductByPCode(int p_code) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		String query = "select * from product where p_code = ? ";
		
		Product product = null;
		
		try {
			psmt = conn.prepareStatement(query);
			psmt.setInt(1,  p_code);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				product = new Product();
				
				product.setP_code(rs.getInt("P_CODE"));
				product.setP_name(rs.getString("P_NAME"));
				product.setP_price(rs.getInt("P_PRICE"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
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
			e.printStackTrace();
		}
		
		
		return product;
	}
	
	
	public static List<Product> findproduct(int p_code) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		String query = "select * from product";
		List<Product> productList = new ArrayList<Product>();
		
		try {
			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				Product product = new Product(rs.getInt("P_CODE"), 
											 rs.getString("P_NAME"), 
											 rs.getInt("P_PRICE"));
				productList.add(product);
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
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
			e.printStackTrace();
		}
		
		
		return productList;
	}
	
	

}
