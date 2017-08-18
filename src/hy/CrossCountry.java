package hy;

import java.util.Set;
import java.util.TreeSet;

import bean.CrossCountryBean;

public class CrossCountry {
	public String ScoreMeet(int numTeams,String finishOrder){
		int j = 0;
		int num = 0;
		int m = 0;
		int sum = 0;
		int num1 = 0;
		String str = "";
		Set<CrossCountryBean> set = new TreeSet<CrossCountryBean>();
		for(char i =0;i<numTeams;i++){
			num1=0;
			CrossCountryBean ccb = new CrossCountryBean();
			char res =(char)(65+i);
			ccb.setAr(res);
			while(true){
				num = finishOrder.indexOf(res,j);
					sum+=num;
					j=num;
					num1++;
					if(num==5){
						ccb.setSum(sum);
					}else if(num == 6){
						ccb.setNum(num);
					}
					if(num==-1)
						break;
			} 
			if(num1>=5){
				set.add(ccb);
			}			
		}
		System.out.println(set.size());
		for(CrossCountryBean ccb:set){
			str+=(String.valueOf(ccb.getAr()));
		}
		return str;
	}
}
