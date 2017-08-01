package gxp;

public class WordForm {
	
	public String getSequence(String word){
		String rel="";
		word=word.toUpperCase();
		for (int i = word.length()-1; i >= 0; i--) {
			String charc=word.toCharArray()[i]+"";
			if("AEIOU".indexOf(charc)!=-1
				||(charc.equals("Y")&&i!=0&&!rel.startsWith("V"))){
				if(!rel.startsWith("V")){
					rel="V"+rel;
				}
			}else{
				if(!rel.startsWith("C")){
					rel="C"+rel;
				}
			}
		}
		return rel;
	}
	public static void main(String[] args) {
		System.out.println(new WordForm().getSequence("yC"));
	}
}
