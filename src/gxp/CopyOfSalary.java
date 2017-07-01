package gxp;

public class CopyOfSalary {
	public int[][] getOvertime(){
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
			for (int j = 0; j < overtime.length; j++) {
				int []curovertime=overtime[j];//当前加班时间段
				//一共3种加班情况 
				//1打卡时间段   交叉 加班前端
				//2打卡时间段   完全覆盖加班时间段
				//3打卡时间段  包含在加班时间段内
				//4打卡时间段   交叉 加班后端
				if(curarrival<=curovertime[0]&&curdeparture<=curovertime[1]){
					//1打卡时间段   交叉 加班前端
					normalCount+=curovertime[0]-curarrival;
					overtimeCount+=curdeparture-curovertime[0];
				}else if(curarrival<=curovertime[0]&&curdeparture>=curovertime[1]){
					//2打卡时间段   完全覆盖加班时间段
					normalCount+=curovertime[0]-curarrival;
					normalCount+=curdeparture-curovertime[1];
					overtimeCount+=curovertime[1]-curovertime[0];
				}else if(curarrival>=curovertime[0]&&curdeparture<=curovertime[1]){
					//3打卡时间段  包含在加班时间段内
					overtimeCount+=curdeparture-curarrival;
				}else if(curarrival>=curovertime[0]&&curdeparture>=curovertime[1]){
					//4打卡时间段   交叉 加班后端
					normalCount+=curdeparture-curovertime[1];
					overtimeCount+=curovertime[1]-curarrival;
				}else{
					//正常上班时间
					normalCount+=curdeparture-curarrival;
				}
			}
		}
		
		return (int)((normalCount*1.0)/3600*wage+(overtimeCount*1.0)/3600*wage*1.5);
	}
	
	public static void main(String[] args) {
		String[] arrival={"08:00:00","13:00:00","19:27:32"} ;
		String[] departure={"12:00:00","17:00:00","20:48:10"} ;
		int wage=1000;
		System.out.println(new CopyOfSalary().howMuch(arrival, departure, wage));
	}
}
