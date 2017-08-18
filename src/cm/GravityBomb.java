package cm;

public class GravityBomb {
	
	public static void main(String[] args) {
		String[] board = {"..x", "x.x", ".x."};
		String[] result = aftermath(board);
		for(String str : result){
			System.out.println(str);
		}
	}
	
	public static String[] aftermath(String[] board){
		int emptyRow = 0;
		for(int i = 0; i < board.length - 1; i ++){
			System.out.println(board.length - 1);
			for(int j = board.length - 1; j > 0; j --){
				System.out.println("i:" + i + ",j:" + j);
				//System.out.println(j+","+(j-1));
				//第k个字符
				for(int k = 0; k < board[i].length(); k ++){
					//x格子下落
					if(board[j].charAt(k) == '.' && board[j - 1].charAt(k) == 'x'){
						board[j] = board[j].substring(0, k) + "x" + board[j].substring(k + 1);
						board[j - 1] = board[j - 1].substring(0, k) + "." + board[j - 1].substring(k + 1);
					}
					//如果最下层全是格子，该行消失，它上层格子下落一行，最上层消失
					if(board[j].indexOf('.') == -1){
						for(int h = j; h > 0; h --){
							board[h] = board[h - 1];
						}
						String empty = "";
						for(int l = 0; l < board[0].length(); l++){
							empty += ".";
						}
						board[emptyRow] = empty;
					}
				}
			}
		}
		return board;
	}
	
}
