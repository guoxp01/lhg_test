package cm;

import java.util.Scanner;

public class Time {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入物业到现在的秒数（0到86399）：");
		int input = scan.nextInt();
		String out = whatTime(input);
		System.out.println(out);
		scan.close();
	}
	
	public static String whatTime(int input){
		String out = null;
		if(input < 0 || input > 86399){
			out = "输入不合法，程序结束。";
		}else{
			int second = input % 60;
			int minute = input % (60 * 60) / 60;
			int hour = input / (60 * 60);
			out = "\"" + hour + ":" + minute + ":" + second + "\"";
		}
		return out;
	}
	
}
