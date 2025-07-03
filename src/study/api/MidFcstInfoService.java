package study.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MidFcstInfoService {

	// 외부 API 요청 -> json 텍스트 응답
	private String requesApi_getMidTa(String tmFc, String regId) throws Exception{
		
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/MidFcstInfoService/getMidTa"); /*URL*/

		urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=TO90wKscUg6u6rP5F%2BGib6c%2BZB23HOQfDM5pnjbHPlrXWlVNUe8JV0mJbe7JpfeuOQQZtupiIlN7w8AQUoo5lw%3D%3D"); /*Service Key*/
		urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
		urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
		urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*요청자료형식(XML/JSON)Default: XML*/
		urlBuilder.append("&" + URLEncoder.encode("regId","UTF-8") + "=" + URLEncoder.encode(regId, "UTF-8")); /*11B10101 서울, 11B20201 인천 등 ( 별첨엑셀자료 참고)*/
		urlBuilder.append("&" + URLEncoder.encode("tmFc","UTF-8") + "=" + URLEncoder.encode(tmFc, "UTF-8")); /*-일 2회(06:00,18:00)회 생성 되며 발표시각을 입력- YYYYMMDD0600(1800) 최근 24시간 자료만 제공*/
		//& -> key : value 느낌으로!! ex) pageNo = 1 & numOfRows = 10 ...

		URL url = new URL(urlBuilder.toString());

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");

		System.out.println("Response code: " + conn.getResponseCode());

		BufferedReader rd;

		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}

		StringBuilder sb = new StringBuilder();
		String line;

		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}

		rd.close();
		conn.disconnect();

		System.out.println(sb.toString());

		String returnText = sb.toString();
		
		return returnText;
	}

	

	// json  텍스트 -> 파싱 -> 데이터 구조 변환 -> 반환
	public MidTaDTO findMidTa(String tmFc, String regId) {
		
		MidTaDTO midTaDTO = null;
		
		try {
			String jsonString = requesApi_getMidTa(tmFc, regId);
			//String jsonString = "{\"response\":{\"header\":{\"resultCode\":\"00\",\"resultMsg\":\"NORMAL_SERVICE\"},\"body\":{\"dataType\":\"JSON\",\"items\":{\"item\":[{\"regId\":\"11C20301\",\"taMin4\":24,\"taMin4Low\":0,\"taMin4High\":0,\"taMax4\":31,\"taMax4Low\":0,\"taMax4High\":0,\"taMin5\":23,\"taMin5Low\":0,\"taMin5High\":0,\"taMax5\":33,\"taMax5Low\":0,\"taMax5High\":0,\"taMin6\":23,\"taMin6Low\":0,\"taMin6High\":0,\"taMax6\":34,\"taMax6Low\":0,\"taMax6High\":0,\"taMin7\":23,\"taMin7Low\":0,\"taMin7High\":0,\"taMax7\":33,\"taMax7Low\":0,\"taMax7High\":0,\"taMin8\":22,\"taMin8Low\":0,\"taMin8High\":0,\"taMax8\":32,\"taMax8Low\":0,\"taMax8High\":0,\"taMin9\":22,\"taMin9Low\":0,\"taMin9High\":0,\"taMax9\":32,\"taMax9Low\":0,\"taMax9High\":0,\"taMin10\":23,\"taMin10Low\":0,\"taMin10High\":0,\"taMax10\":31,\"taMax10Low\":0,\"taMax10High\":0}]},\"pageNo\":1,\"numOfRows\":10,\"totalCount\":1}}}";
			
			//jsonString 텍스트 데이터 -> JSON 파싱 -> midTaDTO
			
			//json-simple 라이브러리
			//JSONObject	{ 			(중괄호로 변환)
			//JSONArray		[			(대괄호로 변환)
			//Key:Value		:value		(value로 변환)
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
			
			JSONObject response = (JSONObject)jsonObj.get("response"); //response를 key값으로 가져오라는 의미
			
			
			JSONObject header = (JSONObject)response.get("header"); // 중괄호 객체라서 JSONObject 변환
			
			System.out.println(header.get("resultCode")); //접근 가능
			System.out.println(header.get("resultMsg")); //접근 가능
			
			
			JSONObject body = (JSONObject)response.get("body");
			
			System.out.println(body.get("dataType"));
			System.out.println(body.get("numOfRows"));
			
			
			JSONObject items = (JSONObject)body.get("items");
			JSONArray item = (JSONArray)items.get("item"); //대괄호 객체라서(배열) JSONArray 변환
			
			/*
			for(int i=0; i<item.size(); i++) {
				item.get(i);
			}
			*/
			JSONObject itemObj = (JSONObject)item.get(0); //중괄호 안에 있는 객체라서 JSONObject
			System.out.println(itemObj.get("regId"));
			System.out.println(itemObj.get("taMin4"));
			System.out.println(itemObj.get("taMax4"));
			System.out.println(itemObj.get("taMin5"));
			System.out.println(itemObj.get("taMax5"));
			
			System.out.println("----------------------------");
			System.out.println(Integer.parseInt(itemObj.get("taMin4").toString())); //변환이 왜 안되었는지 확인용 출력
			//(Integer)itemObj.get("taMin4") 요건 안되는듯! -> 바로 변환이 안되어서?
			
			midTaDTO = new MidTaDTO();
			midTaDTO.setResultCode(header.get("resultCode").toString());
			midTaDTO.setResultMsg(header.get("resultMsg").toString());
			midTaDTO.setRegId(itemObj.get("regId").toString());
			midTaDTO.setTaMin4(Integer.parseInt(itemObj.get("taMin4").toString()));
			midTaDTO.setTaMax4(Integer.parseInt(itemObj.get("taMax4").toString()));
			midTaDTO.setTaMin5(Integer.parseInt(itemObj.get("taMin5").toString()));
			midTaDTO.setTaMax5(Integer.parseInt(itemObj.get("taMax5").toString()));
			
			midTaDTO.setTmFc(tmFc);
			
		} catch (Exception e) {
			// 오류 내용 확인 -> 대처
			
		}
		
		return midTaDTO;
		
	}
	
	
	

}
