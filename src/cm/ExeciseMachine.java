package cm;

public class ExeciseMachine {
	
	public static void main(String[] args) {
		String time = "00:19:16";
		ExeciseMachine machine = new ExeciseMachine();
		int total = machine.getPercentages(time);
		System.out.println("共显示次数为：" + total);
	}
	
	public int getPercentages(String time){
		String[] arr = time.split(":");
		int hour = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[1]);
		int second = Integer.parseInt(arr[2]);
		second += hour * 60 * 60 + min * 60;
		int percent = -1;
		for(int i = 1; i < 100; i ++){
			if(second * i % 100 == 0){
				percent = i;
				break;
			}
		}
		int total = 0;
		for(int i = 1; percent != -1 && i < 100; i ++){
			if(i % percent == 0)
				total ++;
		}
		return total;
	}
	
}
