package gxp;

import java.util.Arrays;

public class DiskSpace {
	public int minDrives(int[] used, int[] total) {
		Arrays.sort(total);
		int usedCount=0;
		for (int i = 0; i < used.length; i++) {
			usedCount+=used[i];
		}
		for (int i = 0; i < total.length; i++) {
			usedCount=usedCount-total[total.length-i-1];
			if(usedCount<=0){
				return i+1;
			}
		}
		return 0;
	}
}
