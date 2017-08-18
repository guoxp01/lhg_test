package hy;

public class LevelUp {
	public int toNextLevel(int[] expNeeded,int received){
		int res = 0;
		int res1 = 0;
		for(int i=0;i<expNeeded.length-1;i++){
			res = expNeeded[i]-received;
			res1 = received-expNeeded[i];
			if(res1<0){
				break;
			}
		}
		return res;
	}
}
