package hy;

public class BigBurger {
	public int maxWait(int[] arrival,int[] service){		
		int waitTime = 0;
		int maxWaitTime = 0;
		for(int i = 0;i<arrival.length-1;i++){
			if(waitTime+arrival[i]+service[i]-arrival[i+1]<0){
				continue;
			}
			waitTime = waitTime+arrival[i]+service[i]-arrival[i+1];
			if(waitTime>maxWaitTime){
				maxWaitTime = waitTime;
			}
		}		
		return maxWaitTime;
	}
}
