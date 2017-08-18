package cm;

public class WordForm {
	
	public static void main(String[] args) {
		String word = "WHEREABOUTS";
		String result = getSequence(word);
		System.out.println(result);
	}
	
	public static String getSequence(String word){
		String trans = "";
		for(int i = 0; i < word.length(); i ++){
			char ch = word.charAt(i);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y'){
				if(ch == 'Y'){
					if(i != 0 && i != word.length()-1
							&& word.charAt(i + 1) != 'A'
							&& word.charAt(i + 1) != 'E'
							&& word.charAt(i + 1) != 'I'
							&& word.charAt(i + 1) != 'O'
							&& word.charAt(i + 1) != 'U'
							&& word.charAt(i + 1) != 'Y'){
						trans += "V";
					}else{
						trans += "C";
					}
				}else{
					trans += "V";
				}
			}else{
				trans += "C";
			}
		}
		System.out.println(trans);
		String result = "";
		for(int i = 0; i < trans.length() - 1; i ++){
			if(trans.charAt(i) != trans.charAt(i + 1))
				result += trans.charAt(i);
		}
		result += trans.charAt(trans.length() - 1);
		return result;
	}
	
}
