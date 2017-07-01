package gxp;

import java.util.HashMap;
import java.util.Map;

public class Substitute {
	public int getValue(String key, String code) {
		Map<String,Integer> keys=new HashMap<String,Integer>();
		for (int i=0;i<key.toCharArray().length;i++) {
			keys.put(key.toCharArray()[i]+"", i+1>9?0:i+1);
		}
		String rel="";
		for (int i = 0; i < code.toCharArray().length; i++) {
			if(keys.get(code.toCharArray()[i]+"")!=null){
				rel+=keys.get(code.toCharArray()[i]+"");
			}
		}
		return Integer.parseInt(rel);
	}
	public static void main(String[] args) {
		System.out.println(new Substitute().getValue("CRYSTALBUM", "MMA"));
	}
}
