package hy;

public class WidgetRepairs {
	public int days(int[] arrivals,int numPerDay){
		
		int num = 0;
		int sum = 0;
		int day = 0;
		
		for(int i = 0;i<arrivals.length;i++){
			sum += arrivals[i];
			if(sum == 0){
				continue;
			}
			sum -=numPerDay;
			num+=1;
			
			if(sum<0){
				sum = 0;
			}	
		}
		day = sum/numPerDay;
		num+=day;
		sum=sum%numPerDay;
		if(sum!=0){
			num+=1;
		}
		return num;
	}
}
