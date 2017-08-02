package gxp;

import java.util.ArrayList;
import java.util.List;

public class Reppity {
	public int longestRep(String input) {
		int maxsize=0;
		List<String> list=new ArrayList<String>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j < input.length(); j++) {
				String curStr=input.substring(0, j);
				if(!list.contains(curStr)){
					if(input.substring(j).indexOf(curStr)!=-1){
						maxsize=curStr.length()>maxsize?curStr.length():maxsize;
					}
				}
			}
		}
		return maxsize;
	}
}
