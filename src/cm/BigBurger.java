package cm;

public class BigBurger {
	
	public static void main(String[] args) {
		int[] arrival = {2, 10, 11};
		int[] service = {3, 4, 3};
		BigBurger bigBurger = new BigBurger();
		int maxTime = bigBurger.maxWait(arrival, service);
		System.out.println("最大等待时间：" + maxTime);
	}
	
	public int maxWait(int[] arrival, int[] service){
		int maxTime = 0;
		int wait = 0;
		int handed = arrival[0] + service[0];//5
		for(int i = 1; i < arrival.length; i ++){
			wait = handed - arrival[i];//5-10=-5
			if(wait < 0)
				wait = 0;//0
			if(wait > maxTime)
				maxTime = wait;
			if(handed > arrival[i]){
				handed += service[i];//5+
			}else{
				handed = arrival[i] + service[i];
			}
			System.out.println("wait:" + wait + ", handed:" + handed);
		}
		return maxTime;
	}
	
}
