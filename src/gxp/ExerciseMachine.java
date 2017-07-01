package gxp;


public class ExerciseMachine {
	public int getPercentages(String time){
		int size=0;
		try {
			String times[]=time.split(":");
			int countSecond=(Integer.parseInt(times[0])*60+Integer.parseInt(times[1]))*60+Integer.parseInt(times[2]);
			for (int i = 1; i < countSecond; i++) {
				double scale=i*100.0/countSecond;
				if((int)scale>0&&(int)scale==scale){
					size++;
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("数据格式错误"+time);
		}
		return size;
	}
	public static void main(String[] args) {
		System.out.println(new ExerciseMachine().getPercentages("12:12:12"));
	}
}
