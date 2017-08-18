package hy;

public class PrefixCode {	
	public String isOne(String[] words){
		for(int i = 0;i<words.length;i++){
			for(int j = 0;j<words.length;j++){
				if(i == j){
					continue;
				}
				if(words[i].startsWith(words[j])){
					return "\"No, "+j+"\"";
				}
			}
		}
		return "\"Yes\"";
	}
}
