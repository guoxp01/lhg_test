package gxp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class A {
	
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new A().getDate4(date)));
		System.out.println(TimeZone.getDefault().getRawOffset());
		A a=new A();
		Long startDate=System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			a.getDate4(date);
		}
		System.out.println(System.currentTimeMillis()-startDate);
	}
	public Date getDate(Date date){
		return new Date(date.getYear(),date.getMonth(),date.getDay());
	}
	public Date getDate2(Date date){
		date.setHours(0);
		date.setMinutes(0);
		date.setSeconds(0);
		return date;
	}
	private static final Integer curTimeZone=TimeZone.getDefault().getRawOffset();
	public Date getDate4(Date date){
		Long lt=date.getTime()/(1000*3600*24);
		return new Date(lt*1000*3600*24-curTimeZone);
	}
	public Date getDate3(Date date){
		Calendar ca=Calendar.getInstance();
		ca.setTime(date);
		ca.set(Calendar.HOUR, 0);
		ca.set(Calendar.MINUTE, 0);
		ca.set(Calendar.SECOND, 0);
		return date;
	}
}
