package cm;

import java.util.Scanner;

public class FormatAmt {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入美元：");
		int dolars = scan.nextInt();
		System.out.println("请输入美分：");
		int cents = scan.nextInt();
		String out = amount(dolars, cents);
		System.out.println(out);
		scan.close();
	}
	
	public static String amount(int dollars, int cents){
		String out = "";
		if(dollars > 2000000000 || dollars <0){
			out = "美元输入错误！";
		}else if(cents < 0 || cents > 99){
			out = "美分输入错误！";
		}else{
			int bit = 0;
			while(dollars % 10 > 0){
				out += String.valueOf(dollars % 10);
				dollars /= 10;
				bit ++;
				if(bit % 3 == 0){
					out += ",";
				}
			}
			String out2 = "";
			for(int i = out.length() - 1; i >= 0; i --){
				out2 += out.charAt(i);
			}
			out = out2;
			if(cents > 9){
				out += "." + cents;
			}else{
				out += ".0" + cents;
			}
		}
		out = "$" + out;
		return out;
	}
	
}
