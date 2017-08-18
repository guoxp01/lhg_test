package cm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BirthDay {
	
	public static void main(String[] args) throws ParseException {
		BirthDay birth = new BirthDay();
		String date = "01/02";
		String[] birthday = {"02/17 Wernie", "10/12 Stefan", "05/18 Stefan"};
		String next = birth.getNext(date, birthday);
		System.out.println(next);
	}
	
	public String getNext(String date, String[] birthday) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
		Calendar calendar = Calendar.getInstance();
		Date now = sdf.parse(date);//现在的日期
		calendar.setTime(now);
		calendar.add(Calendar.YEAR, 1);
		Date next = calendar.getTime();//明年的今天
		for(int i = 0; i < birthday.length; i++){
			Date birth = sdf.parse(birthday[i].split(" ")[0]);
			if(birth.compareTo(now) < 0){
				calendar.setTime(birth);
				calendar.add(Calendar.YEAR, 1);
				birth = calendar.getTime();
			}
			if(birth.compareTo(next) < 0)
				next = birth;
		}
		return sdf.format(next);
	}
	
}
