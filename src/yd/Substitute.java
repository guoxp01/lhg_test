package yd;

public class Substitute {
	public int getValue(String key, String code){
		String result="";
		for (int i = 0; i < code.length(); i++) {
			int index=key.indexOf(code.charAt(i));
			if(index!=-1){
				result+=index==key.length()-1?"0":index+1;
			}
		}
		return result!=""?Integer.parseInt(result):0;
	}
}
