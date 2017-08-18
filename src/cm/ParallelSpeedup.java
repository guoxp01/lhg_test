package cm;

public class ParallelSpeedup {
	
	public static void main(String[] args) {
		int k = 3333;
		int overhead = 2;
		int minService = numProcessors(k, overhead);
		System.out.println("需要最少服务器数量为：" + minService);
	}
	
	public static int numProcessors(int k, int overhead){
		int minService = 1;
		int minTime = Integer.MAX_VALUE;
		for(int i = 1; i <= k; i ++){
			//计算处理器之间通信时间
			int time = 0;
			for(int j = i - 1; j > 0; j--){
				time += j * overhead;
			}
			if(k % i == 0){
				time += k / i;
			}else{
				time += k / i + 1;
			}
			if(time < minTime){
				minTime = time;
				minService = i;
			}
		}
		System.out.println("最少时间：" + minTime);
		return minService;
	}
	
}
