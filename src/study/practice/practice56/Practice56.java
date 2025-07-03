package study.practice.practice56;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Practice56 {

	public static void main(String[] args) {
		try {
			String jsonString = "{\r\n"
					+ "\"도서관\": {\r\n"
					+ "\"위치\": \"서울특별시 강남구\",\r\n"
					+ "\"운영시간\": {\r\n"
					+ "\"평일\": [\"09:00\", \"21:00\"],\r\n"
					+ "\"주말\": [\"10:00\", \"18:00\"]\r\n"
					+ "},\r\n"
					+ "\"책목록\": [\r\n"
					+ "{\r\n"
					+ "\"제목\": \"자바 프로그래밍\",\r\n"
					+ "\"저자\": \"홍길동\",\r\n"
					+ "\"출판연도\": 2023,\r\n"
					+ "\"가격\": 25000,\r\n"
					+ "\"대출가능\": true,\r\n"
					+ "\"카테고리\": [\"프로그래밍\", \"자기계발\"]\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"제목\": \"데이터 분석 입문\",\r\n"
					+ "\"저자\": \"김철수\",\r\n"
					+ "\"출판연도\": 2022,\r\n"
					+ "\"가격\": 28000,\r\n"
					+ "\"대출가능\": false,\r\n"
					+ "\"카테고리\": [\"데이터\", \"분석\"]\r\n"
					+ "}\r\n"
					+ "],\r\n"
					+ "\"특별서비스\": {\r\n"
					+ "\"키오스크\": true,\r\n"
					+ "\"스터디룸\": {\r\n"
					+ "\"개수\": 5,\r\n"
					+ "\"예약 가능\": true,\r\n"
					+ "\"비용\": {\r\n"
					+ "\"1시간당\": 5000,\r\n"
					+ "\"하루\": 30000\r\n"
					+ "}\r\n"
					+ "}\r\n"
					+ "}\r\n"
					+ "}\r\n"
					+ "}";

			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);

			
			JSONObject location = (JSONObject)jsonObj.get("도서관");
			System.out.println("도서관 : \n{위치 : " + location.get("위치") + "}");
			
			//====
			JSONObject time = (JSONObject)location.get("운영시간");
			/*
			System.out.println("오픈시간 \n[평일 : " + time.get("평일"));
			System.out.println("[주말 : " + time.get("주말"));
			*/
			
			JSONArray weekday = (JSONArray)time.get("평일");
			JSONArray weekend = (JSONArray)time.get("주말");
			System.out.println("평일 : " + weekday.get(0) + "~" + weekday.get(1));
			System.out.println("주말 : " + weekend.get(0) + "~" + weekend.get(1));
			System.out.println();

			//====
			
			JSONArray bookList = (JSONArray)location.get("책목록");
			System.out.println("=== 책목록 ===");
			
			
			for(int i=0; i<bookList.size(); i++) {
				JSONObject book = (JSONObject)bookList.get(i);
				
				System.out.println("제목 : " + book.get("제목"));
				System.out.println("저자 : " + book.get("저자"));
				System.out.println("출판연도 : " + book.get("출판연도"));
				System.out.println("가격 : " + book.get("가격"));
				System.out.println("대출가능 : " + book.get("대출가능"));
				//카테고리 내부의 배열도 다르게 출력하고 싶다면 for문 하나 더 사용해서 배열 돌리기!!
				System.out.println("카테고리 : " + book.get("카테고리"));
				System.out.println();
				
			}
			
			//====
			JSONObject spacial = (JSONObject)location.get("특별서비스");
			System.out.println("키오스크 여부 : " + spacial.get("키오스크"));
			
			JSONObject studyRoom = (JSONObject)spacial.get("스터디룸");
			System.out.println("개수 : " + studyRoom.get("개수"));
			System.out.println("예약 가능 여부 : " + studyRoom.get("예약 가능"));
			
			JSONObject price = (JSONObject)studyRoom.get("비용");
			System.out.println("1시간당 : " + price.get("1시간당") + "원");
			System.out.println("하루 : " + price.get("하루") + "원");
			
			

		} catch (Exception e) {
			// 오류 내용 확인 -> 대처

		}

	}

}
