package gxp;

public class Salary {
	private int[][] getOvertime(){
		//需升序排列
		int[][] overtime={{0,6*3600},{18*3600,24*3600}};
		return overtime;
	}
	private int timeToSecond(String time){
		String[]times=time.split(":");
		return Integer.parseInt(times[0])*3600+Integer.parseInt(times[1])*60+Integer.parseInt(times[2]);
	}
	public int howMuch(String[] arrival, String[] departure, int wage) {
		int normalCount=0;
		int overtimeCount=0;
		int[][] overtime=getOvertime();
		for (int i = 0; i < arrival.length; i++) {
			int curarrival=timeToSecond(arrival[i]);
			int curdeparture=timeToSecond(departure[i]);
			
			normalCount+=curdeparture-curarrival;
			
			for (int j = 0; j < overtime.length; j++) {
				int []curovertime=overtime[j];//当前加班时间段
				//一共4种加班打卡情况 
				//1打卡时间段   交叉 加班前端 2打卡时间段   完全覆盖加班时间段  3打卡时间段  包含在加班时间段内  4打卡时间段   交叉 加班后端
				if(curarrival<=curovertime[0]&&curdeparture<=curovertime[1]&&curdeparture>curovertime[0]){
					//1打卡时间段   交叉 加班前端
					overtimeCount+=curdeparture-curovertime[0];
					break;
				}else if(curarrival<=curovertime[0]&&curdeparture>=curovertime[1]){
					//2打卡时间段   完全覆盖加班时间段
					overtimeCount+=curovertime[1]-curovertime[0];
					curarrival=curovertime[1];
				}else if(curarrival>=curovertime[0]&&curdeparture<=curovertime[1]){
					//3打卡时间段  包含在加班时间段内
					overtimeCount+=curdeparture-curarrival;
					break;
				}else if(curarrival>=curovertime[0]&&curarrival<curovertime[1]&&curdeparture>=curovertime[1]){
					//4打卡时间段   交叉 加班后端
					overtimeCount+=curovertime[1]-curarrival;
					curarrival=curovertime[1];
				}
			}
		}
		//加班时间等于总时间减去加班时间
		normalCount=normalCount-overtimeCount;
		return (int)((normalCount*1.0)/3600*wage+(overtimeCount*1.0)/3600*wage*1.5);
	}
	
}
