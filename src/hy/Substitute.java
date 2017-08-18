package hy;

public class Substitute {
	public int getValue(String key,String code){
		StringBuffer sb = new StringBuffer();
		int res = 0;
		for(int i = 0;i<code.length();i++){
			for(int j = 0;j < key.length();j++){
				if(code.charAt(i)==key.charAt(j)){
					if(j==9){
						res=0;
					}else{
						res=j+1;
					}
					sb.append(res);
					break;
				}
			}
		}
		return Integer.parseInt(sb.toString());
	}
}
