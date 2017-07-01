package gxp;

public class Birthday {
	
	public String getNext(String date, String[] birthdays) {
		String minBirth=null;//最小值
		String nextBorth=null;//大于传入日期最小值
		for (int i = 0; i < birthdays.length; i++) {
			int curBirth=toInt(birthdays[i].split(" ")[0]);
			//初始化最小值
			minBirth=minBirth==null||curBirth<toInt(minBirth)?birthdays[i].split(" ")[0]:minBirth;
			if(toInt(date)<=curBirth&&(nextBorth==null||toInt(nextBorth)>curBirth)){
				nextBorth=birthdays[i].split(" ")[0];
			}
		}
		return nextBorth==null?minBirth:nextBorth;
	}
	private int toInt(String birth){
		return Integer.parseInt(birth.replace("/",""));
	}
	
}
