package lmk;

public class Substitute {

	public int getValue(String key, String code){
		char[] codeArray = code.toCharArray();
		String value = "";
		for(char c : codeArray){
			int index = key.indexOf(c);
			if(index == -1){
				continue;
			}
			index = index + 1;
			if(index == 10){
				index = 0;
			}
			value += index + "";
		}
		return Integer.valueOf(value);
	}
	
}
