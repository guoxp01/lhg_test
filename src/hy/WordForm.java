package hy;

public class WordForm {
	public String getSequence(String word){
		word=word.toUpperCase();
		String wordCV = "";
		if(word.charAt(0)=='A'||word.charAt(0)=='E'||word.charAt(0)=='I'||word.charAt(0)=='O'||word.charAt(0)=='U'){
			wordCV+="V";
		}else{
			wordCV+="C";
		}
		for(int i = 1;i<word.length();i++){
			if(word.charAt(i)!='Y'){
				if(word.charAt(i)=='A'||word.charAt(i)=='E'||word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U'){
					if(word.charAt(i-1)!='A'&&word.charAt(i-1)!='E'&&word.charAt(i-1)!='I'&&word.charAt(i-1)!='O'&&word.charAt(i-1)!='U'){
					wordCV+="V";}
				}else{
					if(word.charAt(i-1)=='A'||word.charAt(i-1)=='E'||word.charAt(i-1)=='I'||word.charAt(i-1)=='O'||word.charAt(i-1)=='U'){
						wordCV+="C";}
				}
			}else{
				if((i+1<word.length())&&(word.charAt(i+1)=='A'||word.charAt(i+1)=='E'||word.charAt(i+1)=='I'||word.charAt(i+1)=='O'||word.charAt(i+1)=='U')){
					if(word.charAt(i-1)=='A'||word.charAt(i-1)=='E'||word.charAt(i-1)=='I'||word.charAt(i-1)=='O'||word.charAt(i-1)=='U'){
						wordCV+="C";}
				}else if((i+1<word.length())&&(word.charAt(i+1)!='A'&&word.charAt(i+1)!='E'&&word.charAt(i+1)!='I'&&word.charAt(i+1)!='O'&&word.charAt(i+1)!='U')){
					if(word.charAt(i-1)!='A'&&word.charAt(i-1)!='E'&&word.charAt(i-1)!='I'&&word.charAt(i-1)!='O'&&word.charAt(i-1)!='U'){
						wordCV+="V";
					}
				}else{
					if(word.charAt(i-1)!='A'&&word.charAt(i-1)!='E'&&word.charAt(i-1)!='I'&&word.charAt(i-1)!='O'&&word.charAt(i-1)!='U'){
						wordCV+="V";
					}
				}
			}
		}
		return wordCV;
	}
}
