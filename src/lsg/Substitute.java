package lsg;

public class Substitute {
	public int getValue(String key, String code) {
		char[] codes = code.toCharArray();
		StringBuffer s = new StringBuffer();
		for(int i=0;i<code.length();i++) {
			int index = key.indexOf(codes[i]);
			if(index >= 0) {
				if(index == 9) {
					index = -1;
				}
				s.append(index+1);
			}
		}
		return Integer.parseInt(s.toString());
	}
}
