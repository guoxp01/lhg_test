package yjc;

public class Substiute {
	public int getValue(String key, String code){
		String value="";
		char[] codes=code.toCharArray();
		for (int i = 0; i < codes.length; i++) {
			if(key.contains(String.valueOf(codes[i]))){
				if(key.indexOf(codes[i])+1==10){
					value+=0;
				}else{					
					value+=key.indexOf(codes[i])+1;
				}
			}
		}
		if(value==""){
			return 0;
		}
		return Integer.parseInt(value);
	}
	public static void main(String[] args) {
		Substiute ss=new Substiute();
		System.out.println(ss.getValue("TRADINGFEW", "LGXWEV"));
		System.out.println(ss.getValue("ABCDEFGHIJ", "XJ"));
		System.out.println(ss.getValue("CRYSTALBUM", "MMA"));
	}
}
