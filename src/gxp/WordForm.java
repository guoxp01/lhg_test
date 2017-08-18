package gxp;

public class WordForm {
	
	public String getSequence(String word){
		String rel="";
		word=word.toUpperCase();
		for (int i = word.length()-1; i >= 0; i--) {
			String charc=word.toCharArray()[i]+"";
			if("AEIOU".indexOf(charc)!=-1
				||(charc.equals("Y")&&i!=0&&"AEIOU".indexOf(word.toCharArray()[i-1])==-1
						&&(i==word.length()||"AEIOU".indexOf(word.toCharArray()[i+1])))
						)){
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
		String[] arg2_1 = new String[]{"WHEREABOUTS","yoghurt","YipPy","AyYyEYye","y","YggggggggggggggggggggggGGgggGGggg","aeiouaoeuaoeuoauoeuoEOAuouOAEuoEUOAUEOUAoEUO","ayya","ayYya","dyyyZYUYgzYY","oAuwAUOtAIfA","ObyNKiboYEXsYYAyAelCgoTljImYnYuhkPyRCOj","yyyhYYYUYYYYFyYuYyYIYYCycyyYaYyGYyTeYpaYbY","YYIyYiYAyeyAYyEyayoUYYFyYyyYyYyYyYY","yAqSjuZCQuNPYmXTIiyORwyYoyupliOUAaiYAYi","tGPtHmqRUVmZyYnNRvWXZjhjyyrFFfoPTpTyQcZtABazQYZnqY","uOOOY","YEyyIyyyUyYAYYyuyEyeyYuyYYyi","mvIiOJanymuofPIpypkXBojhyIYyoobanfEP","yOUPnOUuo","oidOOvoiJUoAIOPEaooIoEuQougaaauEoSeoEeeIoIZtEYaYum","AaAeEiqYOUUYUjUi","YYYYbYyYYYyaAyay","YYYYYYyyYYyyyy","TQZnEJhWYYfpeaYikgCjRhUPkbXytyzVyHAZPuo","eUeIYOYEsiYyeiI","el","U","lsYwR","YgIwHUT","IO","yYnyXuYUhEIyPRR","eaaouyieUyIIUOYiUao","eyAgOYeAgiyYyEQiAqUOIyUxCEUUOuyY","seyYIyEYyiYoYyYyHYyj","xMDLcmmKRNOlJHZLfwNtRdVcprilGcQghwXZsgRKMiuC","YgIoYy","iAIUOEeyIOaYuyOaUaaYioYaEA","yYeyuYEUUYYYoYUyYYyeAyOYOiAOyYeYIoYoyx","IxA","uAYaI","tyYyYYyrYnyYEoEyIAYYYY","AyfyYAOoYYaYazuCEYuyyOyyuoYIyyayyYNy","uouEyXOfKodaIEyuAY","yhMyyYYYYYyyfYYYyyYyyYYYYdpypYyYYyYMyyYyyYyyyyyYYq","aYYYyQYQcUUiDHIjjyHoxaYyyOY","MYYnoOYYaOSDyuLeUIonaEEuEuAN","yIYAeYEYDyaYiEuayyyyYBuYeYUkYAYeYYuyyy","YuvYyYYYDayuAnYyOYOOIUNTyIyYYYiIyYSyyaYYpyEyyyiYYY","EAeokCaEPYIuOieeoOYfaiiYIyaea","NantaYuXByYjxRpishgYYosqEgoYOZoIOEEeMiuqaDIo","UYyYyYYoYzyeYJzyYzYYyYeYwYyYy","yEqywf","uauOO","YYoLOsuyeRc","yoeeUiYAaYyyuIIEEuyYAYOoYoeouOuOYIYaOyo","ASyxyyeoJyyYWyYNYYeYYyUyYeyYueyyyyYYyYyypyYYYO","TyHyFYkcYaLPyYmeZGyidyDyUYYfcoNyYjyOzOYYYyF","BYxfGYNvySYYyltByyqrPYdlx","YYYYYyyyyyYYYYYyyyyyYYYYYyyyyyYYYYYyyyyyYYYYYyyyyy","yC","yC","a","aaaaaaaaaaaa","yyo","dYeYddYeeyYYYyyYaoopopo","y","aAaA","toy","RRRRRRRR","YipPy","YeeeYyYeeYeyEYghihiEeeIhYyy","aeiou","AyYyEYye","ICE","AYYYYYYYYYYYYYYYYYYYY","AY","yyyyyyy","BEBA"};
		String[] result2 = new String[]{"CVCVCVC","CVCVC","CVCV","VCVCVCV","C","C","V","VCV","VCVCV","CVCVCVCVC","VCVCVCV","VCVCVCVCVCVCVCVCVCVCVCVCVCVC","CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCV","CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVC","CVCVCVCVCVCVCVCVCVCVCVCV","CVCVCVCVCVCVCVCVCV","VC","CVCVCVCVCVCVCVCVCVCVCVCV","CVCVCVCVCVCVCVCVCVCVCVC","CVCV","VCVCVCVCVCVCVCVCVCVCVC","VCVCVCV","CVCVCVCVCVCVCVC","CVCVCVCVCVCVCV","CVCVCVCVCVCVCVCVCVCV","VCVCVCVCV","VC","V","CVC","CVCVC","V","CVCVCVCVCVC","VCVCVCV","VCVCVCVCVCVCVCVCVCVCVCV","CVCVCVCVCVCVCVCVC","CVCVCVC","CVCV","VCVCVCVCVCV","CVCVCVCVCVCVCVCVCVCVCVCVCVC","VCV","VCV","CVCVCVCVCVCVCVCVCV","VCVCVCVCVCVCVCVCVCVCVCVCVCV","VCVCVCVCVC","CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVC","VCVCVCVCVCVCVCVCVCVCVC","CVCVCVCVCVCVC","CVCVCVCVCVCVCVCVCVCVCVCVCVCVC","CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVC","VCVCVCVCVCV","CVCVCVCVCVCVCVCVCVCVCVCVCVCV","VCVCVCVCVCVCVCVCVCVCVC","CVCVC","V","CVCVCVCVC","CVCVCVCVCVCVCVCVCVCV","VCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCV","CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVC","CVCVCVCVCVCVCVC","CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCV","C","C","V","V","CV","CVCVCVCVCVCVCVCV","C","V","CVC","C","CVCV","CVCVCVCVCVCVCVCVCV","V","VCVCVCV","VCV","VCVCVCVCVCVCVCVCVCVCV","VC","CVCVCVC","CVCV"};
		for (int i = 0; i < result2.length; i++) {
			String rel=new WordForm().getSequence(arg2_1[i]);
			if(!rel.equals(result2[i])){
				System.out.println("单词：		"+arg2_1[i]);
				System.out.println("正确答案：	"+result2[i]);
				System.out.println("程序输出：	"+rel);
			}
		}
//		System.out.println(new WordForm().getSequence("AY"));
	}
}
