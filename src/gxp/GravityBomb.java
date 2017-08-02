package gxp;

public class GravityBomb {
	public String[] aftermath(String[] board) {
		Integer minSize=null;
		int[] lines=new int[board[0].length()];
		//每列x数量
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < lines.length; j++) {
				if((board[i].toCharArray()[j]+"").equals("X")){
					lines[j]=lines[j]+1;
				}
			}
		}
		//求最小个数
		for (int i = 0; i < lines.length; i++) {
			minSize=minSize==null||lines[i]<minSize?lines[i]:minSize;
		}
		for (int i = 0; i < board.length; i++){
			String curRow="";
			for (int j = 0; j < lines.length; j++) {
				if(lines[j]-minSize>i){
					curRow+="X";
				}else{
					curRow+=".";
				}
			}
			board[board.length-i-1]=curRow;
		}
		return board;
	}
}
