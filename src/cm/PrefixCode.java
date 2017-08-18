package cm;

public class PrefixCode {
	
	public static void main(String[] args) {
		String[] words = {"no", "nosy", "neighbors", "needed"};
		String result = isOne(words);
		System.out.println(result);
	}
	
	public static String isOne(String[] words){
		int total = 0;
		for(int i = 0; i < words.length; i++){
			for(int j = 0; j < words.length; j ++){
				if(words[i] != words[j]){
					int num = words[i].indexOf(words[j]);
					if(num != -1)
						total ++;
				}
			}
		}
		if(total > 0){
			return "No," + total;
		}else{
			return "Yes";
		}
	}
	
}
