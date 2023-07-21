package exam08_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice {
	
	public static void main(String[] args) throws Exception {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String result = sdf.format(d);
		System.out.println(result);
		
		String s = "2023.05.13";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
		Date result2 = sdf2.parse(s);
		System.out.println(result2);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(result2);
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("년:" + year);
		
		cal.set(2023, 12, 15);
		System.out.println(cal.get(Calendar.MONTH));
		
	}

}
