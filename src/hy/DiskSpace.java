package hy;

import java.util.Arrays;

public class DiskSpace {
	public int minDirves(int[] used,int[] total){
		Arrays.sort(total);
		int j = 0;
		int res = 0;
		int num = 0;
		boolean flag = false;
		for(int i = total.length-1;i>=0;i--){
			flag = false;
			for(;j<used.length;j++){
				flag = true;
				res = total[i]-used[j];
				if(res>0){
					total[i] = res;
				}else if(res < 0){
					used[j] = used[j]-total[i];
					break;
				}else{
					j++;
					break;
				}
			}
			if(flag){
				num++;
			}
		}
		return num;
	}
}
