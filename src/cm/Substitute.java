package cm;

public class Substitute {
	
	public static void main(String[] args) {
		String key = "CRYSTALBUM";
		String code = "MMA";
		int value = getValue(key, code);
		System.out.println("解码得值为：" + value);
	}
	
	public static int getValue(String key, String code){
		String result = "";
		for(int i = 0; i< code.length(); i ++){
			char c = code.charAt(i);
			int position = key.indexOf(c);
			if(position != -1){
				if(position == 9){
					position = 0;
				}else{
					position += 1;
				}
				result += position;
			}
		}
		System.out.println(result);
		return Integer.valueOf(result);
	}
	
}
