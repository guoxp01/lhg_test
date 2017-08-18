package hy;


/**
 * 返回固定程序显示百分比的次数
 * @author zhaowei
 *	返回值为 -1时 :表示传入的参数有无<br>
 *	 
 */
public class ExerciseMachine {
	public int getPercentages(String time){
		String[] times = time.split(":");
		if(times.length!=3){
			return -1;
		}
		int h = Integer.parseInt(times[0]);
		int m = Integer.parseInt(times[1]);
		int s = Integer.parseInt(times[2]);
		if(h>23||h<0||m>59||m<0||s>59||s<0){
			return -1;
		}
		if(h==0&&m==0&&s==0){
			return -1;
		}
		int sceonds = h*3600+m*60+s;
		int num = 0;
		for(int i = 1;i<sceonds;i++){
			if((i*100)%sceonds==0){
				num++;
			}
		}
		return num;
	}
}
