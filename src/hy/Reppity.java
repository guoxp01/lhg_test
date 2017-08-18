package hy;

public class Reppity {
	public int longstRep(String input){
		int num = 0;
		int res = 0;
		int sum = 0;
		String str = null;
		for(int i=0;i<input.length();i++){
			for(int j =0;j<input.length();j++){
				str = input.substring(i,j);
				num=0;
				while(input.indexOf(str,res)!=-1){
					num++;
					res = input.indexOf(str,res);
				}
				if(num>=2){
					if(str.length()>sum){
						sum = str.length();
					}
				}
			}
		}	
		return sum;
	}
}
