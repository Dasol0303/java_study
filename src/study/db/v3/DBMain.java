package study.db.v3;

import java.util.List;

import study.db.v1.Dept;

public class DBMain {

	public static void main(String[] args) {

		DeptDAO deptDAO = new DeptDAO();
		
		ProductDAO productDAO = new ProductDAO();
		
		Dept d = deptDAO.findDeptByDeptno(30);
		
		System.out.println(d);
		
		List<Dept> dList = deptDAO.findDeptList();
		for(Dept dp : dList) {
			System.out.println(dp);
		}
		
		List<ProductDTO> pList = productDAO.findProductList();
		for(ProductDTO pd : pList) {
			System.out.println(pd);
		}
		
		/*
		int rs1 = deptDAO.saveDept(50, "Manage", "Seoul");
		if(rs1 > 0) {
			System.out.println("저장이 성공했다");
		}
		
		Dept newSaveDept = new Dept();
		newSaveDept.setDeptno(60);
		newSaveDept.setDname("Design");
		newSaveDept.setLoc("Busan");
		
		
		int rs2 = deptDAO.saveDept( newSaveDept );
		if(rs2 > 0) {
			System.out.println("저장이 성공했다");
		}
		*/
		
		int rs3 = deptDAO.removeDept(50);
		if(rs3 > 0) {
			System.out.println("삭제성공 : rs3 : " + rs3);
		}
		
		//Dept mdDept = new Dept(60, "Design", "Busan");
		Dept mdDept = deptDAO.findDeptByDeptno(60); //원본 데이터 조회
		
		//수정될 데이터로 변경
		//mdDept.setDname("DesignUI");
		mdDept.setLoc("Ulsan");
		
		int rs4 = deptDAO.modifyDept(mdDept);
		if(rs4 > 0) {
			System.out.println("수정이 잘 됐나보다");
		}
		
		
		
	}

}
