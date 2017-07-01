package lsg;

public class ParallelSpeedup {
	public int numProcessors(int k, int overhead) {
		int number = 1;
		int time = k;
		for(int i=2;i*(i-1)/2*overhead<=time;i++) {
			int time1 = i*(i-1)/2*overhead;
			int time2 = k%i==0?k/i:k/i+1;
			if(time1 + time2 < time) {
				time = time1 + time2;
				number = i;
			}
		}
		return number;
	}
}
