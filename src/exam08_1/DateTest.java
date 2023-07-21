package exam08_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws Exception {
		//날짜 데이터
		
		Date d = new Date();
		
		System.out.println(d); //d.toString() //참조변수는 자동으로 toString으로 나옴 // 주소값이 안나옴 -- 재정의 됨
		/*
		 * d.toString() 했는데 클래스@16진수값이 출력되면 Object
		 */
		
		//java.text.SimpleDateFormat 클래스와 병행해서 사용한다.
		//가. Date타입 --> String
		//Fri Jul 21 15:19:55 KST 2023 ===> 특정포맷을 가진 문자열로 변경
		/*
		 * 날짜 포맷
		 * 년도 : yyyy
		 * 월 : MM
		 * 일 : dd
		 * 시간 : HH
		 * 분 : mm
		 * 초 : ss
		 */
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd, HH:mm:ss");
		String result = sdf.format(d);
		System.out.println(result);
		
		//나. String --> Date
		String s = "2023.05.13";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
		Date d2 = sdf2.parse(s);
		System.out.println(d2);
		
		//Date -> Calendar
				Calendar cal = Calendar.getInstance();
				cal.setTime(d2);
		
		
	}

}
