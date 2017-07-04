package gxp;

public class LevelUp {
	
	public int toNextLevel(int[] expNeeded, int received) {
		for (int i = 0; i < expNeeded.length; i++) {
			if(received-expNeeded[i]<0){
				return Math.abs(received-expNeeded[i]);
			}
		}
		return 0;
	}
	
}
