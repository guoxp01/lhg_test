package hy;

import java.util.Arrays;

public class GravityBomb {
	public String[] aftermath(String[] board){
		String str = "";
		int num = 0;
		for(int i=0;i<board.length;i++){
			num = board[i].length();
			for(int j = 0;j<num;j++){
				if(board[i].indexOf('X', j)!=-1){
					str+=board[i].indexOf('X', j);
					j=board[i].indexOf('X', j);
				}
			}
		}
		int[] arr = new int[num];
 		for(int i=0;i<num;i++){
			for(int j = 0;j<str.length();j++){
				if(str.indexOf(String.valueOf(i),j)!=-1){
					arr[i]+=1;
					j=str.indexOf(String.valueOf(i),j);
				}
			}
		}
a: 	while(true){
 		for(int i= 0;i<num;i++){
 			if(arr[i]==0){
 				break a;
 				
 			}
 		}
 		for(int i = 0;i<num;i++){
 			arr[i]-=1;
 		}
 	}
	for(int j= board.length-1;j>=0;j--){	
		board[j]="";
		for(int i= 0;i<num;i++){
			if(arr[i]>0){
				board[j]+="X";
				arr[i]-=1;
			}else{
				board[j]+=".";
			}
		}
	}	
		return board;
	}
}
