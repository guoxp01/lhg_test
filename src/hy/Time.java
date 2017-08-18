package hy;

public class Time {
	public String whatTime(int sceonds){
		if(sceonds>86399||sceonds<0){
			return "请输入0-86399之间的数";
		}else{
			int h = sceonds/3600;
			int m = sceonds%3600/60;
			int s = sceonds%60;
			return "\""+h+":"+m+":"+s+"\"";
		}
	}
}
