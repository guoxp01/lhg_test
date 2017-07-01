package wsj;

public class Substitute {
	public int getValue(String key,String code){
		
		char[] keys = key.toCharArray();
		char[] codes = code.toCharArray();
		String result = "";
		for(int i=0;i< codes.length;i++){
			for(int j=0;j< keys.length;j++){
				if(codes[i]==keys[j]){
					if(j==keys.length-1){
						result= result+0;
					}else{
						result= result+(j+1);
					}
				}
			}
		}
		return Integer.parseInt(result);
	}
}
