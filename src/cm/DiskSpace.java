package cm;

public class DiskSpace {
	
	public static void main(String[] args) {
		int[] used = {750, 800, 850, 900, 950};
		int[] total = {800, 850, 900, 950, 1000};
		int num = minDrives(used, total);
		System.out.println("最少使用磁盘数：" + num);
	}
	
	public static int minDrives(int[] used, int[] total){
		int num = 0;//需要的最小磁盘书
		int sum = 0;//数据总量
		int save = 0;
		for(int i = 0; i< total.length - 1; i ++){
			for(int j = i + 1; j <total.length; j++){
				if(total[i] < total[j]){
					int trans = total[i];
					total[i] = total[j];
					total[j] = trans;
				}
			}
		}
		for(int i = 0; i < used.length; i ++){
			sum += used[i];
		}
		int i = 0;
		while(sum > save){
			num ++;
			save += total[i];
		}
		return num;
	}
	
}


