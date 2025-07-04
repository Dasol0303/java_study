package study.practice.practice57;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Practice57 {

	public static void main(String[] args) {

		try {
			String jsonString = "{\r\n"
					+ "\"employees\": [\r\n"
					+ "{\r\n"
					+ "\"id\": 1,\r\n"
					+ "\"name\": \"홍길동\",\r\n"
					+ "\"position\": \"개발자\",\r\n"
					+ "\"salary\": 50000,\r\n"
					+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"id\": 2,\r\n"
					+ "\"name\": \"김철수\",\r\n"
					+ "\"position\": \"디자이너\",\r\n"
					+ "\"salary\": 40000,\r\n"
					+ "\"skills\": [\"Photoshop\", \"Illustrator\"]\r\n"
					+ "}\r\n"
					+ "],\r\n"
					+ "\"company\": {\r\n"
					+ "\"name\": \"주식회사 ABC\",\r\n"
					+ "\"address\": \"서울시 강남구\",\r\n"
					+ "\"established\": \"1990-01-01\",\r\n"
					+ "\"departments\": [\r\n"
					+ "{\r\n"
					+ "\"name\": \"개발부\",\r\n"
					+ "\"employees\": [1, 3, 5]\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"name\": \"디자인부\",\r\n"
					+ "\"employees\": [2, 4]\r\n"
					+ "}\r\n"
					+ "]\r\n"
					+ "},\r\n"
					+ "\"projects\": [\r\n"
					+ "{\r\n"
					+ "\"title\": \"사내 시스템 개발\",\r\n"
					+ "\"budget\": 100000,\r\n"
					+ "\"team\": [1, 3]\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"title\": \"웹 디자인 프로젝트\",\r\n"
					+ "\"budget\": 80000,\r\n"
					+ "\"team\": [2, 4]\r\n"
					+ "}\r\n"
					+ "]\r\n"
					+ "}";


			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);

			//====
			JSONArray employees = (JSONArray)jsonObj.get("employees");
			System.out.println("employees : ");

			for(int i=0; i<employees.size(); i++) {
				JSONObject listEm = (JSONObject)employees.get(i);

				System.out.println("id : " + listEm.get("id"));
				System.out.println("name : " + listEm.get("name"));
				System.out.println("position : " + listEm.get("position"));
				System.out.println("salary : " + listEm.get("salary"));
				
				JSONArray skills = (JSONArray)jsonObj.get("skills");
				System.out.println("skills : " + listEm.get("skills"));

			}


			//====
			JSONObject company = (JSONObject)jsonObj.get("company");

			System.out.println("name : " + company.get("name"));
			System.out.println("address : " + company.get("address"));
			System.out.println("established : " + company.get("established"));

			JSONArray departments = (JSONArray)company.get("departments");
			for(int i=0; i<departments.size(); i++) {
				JSONObject listDept = (JSONObject)departments.get(i);

				System.out.println("name : " + listDept.get("name"));
				System.out.println("employees : " + listDept.get("employees"));
			}



			//====
			JSONArray projects = (JSONArray)jsonObj.get("projects");

			for(int i=0; i<projects.size(); i++) {
				JSONObject listProject = (JSONObject)projects.get(i);

				System.out.println("title : " + listProject.get("title"));
				System.out.println("budget : " + listProject.get("budget"));

				JSONArray team = (JSONArray)listProject.get("team");
				System.out.println("team : " + team);

			}


		} catch (Exception e) {
			// 오류 내용 확인 -> 대처

		}

	}

}
