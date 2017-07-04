package gxp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrossCountry {
	
	public String scoreMeet(int numTeams, String finishOrder) {
		Map<String,List<Integer>> teams=new HashMap<String, List<Integer>>();
		char[] times=finishOrder.toCharArray();
		
		for (int i = 0; i < times.length; i++) {
			String team=times[i]+"";
			List<Integer> list=teams.get(team)==null?new ArrayList<Integer>():teams.get(team);
			if(list.size()<6){
				list.add(i+1);
				teams.put(team, list);
			}
		}
		
		Map<String,Integer> countMap=new HashMap<String, Integer>();
		List<String> tks=new ArrayList<String>(teams.keySet());
		for (String key:tks) {
			List<Integer> ts=teams.get(key);
			if(ts.size()<5){
				teams.remove(key);
			}else{
				int countRank=0;
				for (int i = 0; i < 5; i++) {//只取前五名
					countRank+=ts.get(i).intValue();
				}
				countMap.put(key, countRank);
			}
		}
		List<String> keys=new ArrayList<String>(teams.keySet());
		
		final Map<String,Integer> countMapf=countMap;
		final Map<String,List<Integer>>  teamsf=teams;
		Collections.sort(keys, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int cp=countMapf.get(o1).compareTo(countMapf.get(o2));
				if(cp!=0){
					return cp;
				}else{
					if(teamsf.get(o1).size()>teamsf.get(o2).size()){
						return -1;
					}else if(teamsf.get(o2).size()>teamsf.get(o1).size()){
						return 1;
					}if(teamsf.get(o1).size()==6&&teamsf.get(o2).size()==6){
						if(teamsf.get(o1).get(5).intValue()<teamsf.get(o2).get(5).intValue()){
							return -1;
						}else if(teamsf.get(o2).get(5).intValue()<teamsf.get(o1).get(5).intValue()){
							return 1;
						}
					}{
						return o1.compareTo(o2);
					}
				}
			}
		});
		String rel="";
		for (String team:keys) {
			rel+=team;
		}
		return rel;
	}
	
	
}
