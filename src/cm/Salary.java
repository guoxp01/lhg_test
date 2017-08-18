package cm;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Salary {
	
	public static void main(String[] args) throws ParseException {
		String[] arrival = {"08:00:00", "13:00:00", "19:27:32"};
		String[] departure = {"12:00:00", "17:00:00", "20:48:10"};
		int wage = 1000;
		int salary = howMuch(arrival, departure, wage);
		System.out.println("该员工薪水为：" + salary);
	}
	
	public static int howMuch(String[] arrival, String[] departure, int wage) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		long eStart = sdf.parse("18:00:00").getTime();
		long eEnd = sdf.parse("24:00:00").getTime();
		long mStart = sdf.parse("00:00:00").getTime();
		long mEnd = sdf.parse("6:00:00").getTime();
		int salary = 0;
		for(int i = 0; i < arrival.length; i++){
			long arr = sdf.parse(arrival[i]).getTime();//开始工作时间
			long dep = sdf.parse(departure[i]).getTime();//下班时间
			if(dep - arr < 0){
				dep = -dep;
			}
			if(arr > eStart && arr < eEnd){//如果在加薪时段1
				if(dep < eEnd){//如果所有时间均在加班时段
					salary += (dep - arr) / 1000 / 60 / 60 * wage * 1.5;
				}else{
					salary += (eEnd - arr) / 1000 / 60 / 60 * wage * 1.5
							+ (dep - eEnd) / 1000 / 60 / 60 * wage;
				}
			}
			if(arr > mStart && arr < mEnd){//如果在加薪时段2
				if(dep < mEnd){//如果所有时间均在加班时段
					salary += (dep - arr) / 1000 / 60 / 60 * wage * 1.5;
				}else{
					salary += (mEnd - arr) / 1000 / 60 / 60 * wage * 1.5
							+ (dep - mEnd) / 1000 / 60 / 60 * wage;
				}
			}
			salary += (dep - arr) / 1000 / 60 / 60 * wage;
		}
		return salary;
	}
}


