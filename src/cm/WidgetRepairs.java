package cm;

public class WidgetRepairs {
	
	public static void main(String[] args) {
		int[] arrivals = {6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6};
		int numPerDay = 3;
		int totalDay = days(arrivals, numPerDay);
		System.out.println("总共需要天数为：" + totalDay);
	}
	
	public static int days(int[] arrivals, int numPerDay){
		int totalDay = 0;
		int last = 0;
		for(int i = 0; i < arrivals.length; i++){
			if(arrivals[i] != 0 || last != 0){
				last = last + arrivals[i] - numPerDay;
				if(last < 0)
					last = 0;
				totalDay ++;
			}
		}
		while(last > 0){
			totalDay ++;
			last -= numPerDay;
		}
		return totalDay;
	}
	
}
