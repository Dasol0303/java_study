package study.db.v3;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertDateUtil {

	
	// Timestamp -> LocalDateTime
	public static LocalDateTime convertTimestampToLocalDateTime(Timestamp ts) {
		return ts.toLocalDateTime();
	}
	
	
	// LocalDateTime -> Timestamp
	public static Timestamp convertLocalDateTimeToTimestamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt);
	}
	
	
	//String -> LocalDateTime
	public static LocalDateTime converDateTimeStringToLocalDateTime(String str) {
		// 2020-02-02
		//2020/02/02
		//2020:02:02
		//20200202
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime ldt = LocalDateTime.parse(str, dtf);

		return ldt;
	}
	
	//String -> LocalDateTime
	public static LocalDateTime converDateStringToLocalDateTime(String str) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(str, dtf);

		return ld.atStartOfDay();
	}
	
	//String -> LocalDateTime
	public static LocalDateTime converDateStringToLocalDateTime2(String str) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ld = LocalDate.parse(str, dtf);

		return ld.atStartOfDay();
	}
	
	//String -> LocalDateTime
	public static LocalDateTime converDateStringToLocalDateTime3(String str) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate ld = LocalDate.parse(str, dtf);

		return ld.atStartOfDay();
	}
	
	//String -> LocalDate
	public static LocalDate converStringToLocalDate(String str) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(str, dtf);

		return ld;
	}
	
	
	// LocalDate -> LocalDateTime
	public static LocalDateTime convertLocalDateToLocalDateTime(LocalDate ld) {
		return ld.atStartOfDay();
	}
	
	
	// LocalDateTime -> String
	public static String conertLocalDateTimeToString(LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return ldt.format(dtf);
	}
	
	public static String conertLocalDateTimeToString2(LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		return ldt.format(dtf);
	}
	
	public static String conertLocalDateTimeToString3(LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return ldt.format(dtf);
	}
	
	
}
