package study.practice.practice58;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Practice58Info {


	public Practice58DTO getPractice58() {

		Practice58DTO prac58DTO = null;


		try {

			String jsonText = "{\r\n"
					+ "\"id\": 1,\r\n"
					+ "\"name\": \"John Doe\",\r\n"
					+ "\"contacts\": [\r\n"
					+ "{\r\n"
					+ "\"type\": \"email\",\r\n"
					+ "\"value\": \"john.doe@example.com\"\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"type\": \"phone\",\r\n"
					+ "\"value\": \"01023456789\"\r\n"
					+ "}\r\n"
					+ "],\r\n"
					+ "\"address\": {\r\n"
					+ "\"street\": \"123 Main Street\",\r\n"
					+ "\"city\": \"Seoul\",\r\n"
					+ "\"zipcode\": \"12345\"\r\n"
					+ "},\r\n"
					+ "\"orders\": [\r\n"
					+ "{\r\n"
					+ "\"orderId\": \"ORD-001\",\r\n"
					+ "\"date\": \"2024-07-09\",\r\n"
					+ "\"items\": [\r\n"
					+ "{\r\n"
					+ "\"id\": 1,\r\n"
					+ "\"name\": \"Smartphone\",\r\n"
					+ "\"quantity\": 2\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"id\": 2,\r\n"
					+ "\"name\": \"Laptop\",\r\n"
					+ "\"quantity\": 1\r\n"
					+ "}\r\n"
					+ "]\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"orderId\": \"ORD-002\",\r\n"
					+ "\"date\": \"2024-07-10\",\r\n"
					+ "\"items\": [\r\n"
					+ "{\r\n"
					+ "\"id\": 3,\r\n"
					+ "\"name\": \"Headphones\",\r\n"
					+ "\"quantity\": 1\r\n"
					+ "}\r\n"
					+ "]\r\n"
					+ "}\r\n"
					+ "]\r\n"
					+ "}";

			JSONParser jsonParser = new JSONParser();
			JSONObject obj = (JSONObject)jsonParser.parse(jsonText);

			prac58DTO = new Practice58DTO(); //초기화?

			prac58DTO.setId( objectToInt(obj.get("id")) );
			prac58DTO.setName( valueToString(obj.get("name").toString()) );


			//===
			JSONArray contacts =(JSONArray)obj.get("contacts");

			List<ContactDTO> contactList = new ArrayList<ContactDTO>();
			for(int i=0; i<contacts.size(); i++) {

				ContactDTO contact = new ContactDTO();
				contact.setType(valueToString(((JSONObject)contacts.get(i)).get("type")));
				contact.setValue(valueToString(((JSONObject)contacts.get(i)).get("value")));
				contactList.add(contact);
			}
			prac58DTO.setContacts(contactList);


			//===
			JSONObject address =(JSONObject)obj.get("address");

			AddressDTO addressDTO = new AddressDTO();

			addressDTO.setStreet( valueToString(address.get("street")) );
			addressDTO.setCity( valueToString(address.get("city")) );
			addressDTO.setZipcode( valueToString(address.get("zipcode")) );

			prac58DTO.setAddress(addressDTO);


			//===
			JSONArray orders =(JSONArray)obj.get("orders");

			List<OrdersDTO> ordersList = new ArrayList<OrdersDTO>();

			for(int i=0; i<orders.size(); i++) {
				JSONObject order =(JSONObject)orders.get(i);
				
				OrdersDTO orderDTO = new OrdersDTO();
				
				orderDTO.setOrderId(valueToString(order.get("orderId")));
				orderDTO.setDate(valueToString(order.get("date")));

				
				JSONArray items =(JSONArray)order.get("items");
				
				List<ItemDTO> itemList = new ArrayList<ItemDTO>();
				for(int k=0; k<items.size(); k++) {
					JSONObject item =(JSONObject)items.get(k);
					
					ItemDTO itemDTO = new ItemDTO();
					
					itemDTO.setId(objectToInt(item.get("id")));
					itemDTO.setName(valueToString(item.get("name")));
					itemDTO.setQuantity(objectToInt(item.get("quantity")));
					
					itemList.add(itemDTO);
				}
				
				orderDTO.setItems(itemList);
				
				ordersList.add(orderDTO);
			}
			
			prac58DTO.setOrders(ordersList);


		} catch (ParseException e) {
			// TODO Auto-generated catch block
		}

		return prac58DTO;
	}


	//DTO를 옮겨담을 때 변수처럼 적용하려는 메소드!!
	public int objectToInt(Object obj) {
		return Integer.parseInt(obj.toString());
	}


	// 예상치 못한 null에 exception이 터지는 걸 방지하는 메소드!!
	public String valueToString(Object obj) {
		return obj == null ? null : obj.toString();
	}


}
