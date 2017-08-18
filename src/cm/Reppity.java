package cm;

public class Reppity {
	
	public static void main(String[] args) {
		String input = "ABCDEXXXYYYZZZABCDEZZZYYYXXX";
		int len = longestRep(input);
		System.out.println("出现次数最多子串长度为：" + len);
	}
	
	public static int longestRep(String input){
		int maxNum = 0;
		int len = 0;
		for(int i = 0; i < input.length(); i ++){
			for(int j = i + 1; j < input.length() + 1; j ++){
				int num = 0;
				String subString = input.substring(i, j);
				int po = 0;
				while(input.indexOf(subString, po) != -1){
					num ++;
					po = input.indexOf(subString, po) + subString.length();
				}
				if(num >= maxNum){
					maxNum = num;
					if(subString.length() > len){
						len = subString.length();
					}
				}
			}
		}
		return len;
	}
	
}
