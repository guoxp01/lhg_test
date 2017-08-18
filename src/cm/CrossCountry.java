package cm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CrossCountry {
	
	public static void main(String[] args) {
		int numTeams = 2;
		String finishOrder ="ABDCBADBDCCDBCDBCAAAC";
						  //"012345678901234567890"
		String result = scoreMeet(numTeams, finishOrder);
		System.out.println("比赛结果为：" + result);
	}
	
	public static String scoreMeet(int numTeams, String finishOrder){
		String str = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < finishOrder.length(); i ++){
			int score = 0;
			char ch = (char) ('A' + i);
			int people = 0;
			for(int j = 0; j < finishOrder.length(); j ++){
				char a = finishOrder.charAt(j);
				if(a == ch){
					score += j;
					people ++;
				}
			}
			if(people >= 5){
				str += ch;
				map.put(String.valueOf(ch), score);
			}
		}
		System.out.println("符合条件的队伍：" + str);
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
		list.sort(new Comparator<Entry<String, Integer>>(){
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}
		});
		System.out.println(list);
		String result = "";
		for(int i = 0; i < list.size(); i ++){
			result += list.get(i).getKey();
		}
		return result;
	}
	
}
