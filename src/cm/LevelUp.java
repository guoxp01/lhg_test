package cm;

public class LevelUp {
	
	public static void main(String[] args) {
		int[] expNeeded = {150, 450, 900, 1800};
		int received = 450;
		int nextLevelExp = toNextLevel(expNeeded, received);
		System.out.println("升到下一级需要经验：" + nextLevelExp);
	}
	
	public static int toNextLevel(int[] expNeeded, int received){
		int nextLevelExp = 0;
		for(int i = 0; i < expNeeded.length; i ++){
			if(received < expNeeded[i]){
				nextLevelExp = expNeeded[i] - received;
				break;
			}
		}
		return nextLevelExp;
	}
	
}
