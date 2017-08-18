package cm;

public class Rounder {
	
	public static void main(String[] args) {
		int n = 123456;
		int b = 7;
		int result = round(n, b);
		System.out.println("舍入后得：" + result);
	}
	
	public static int round(int n, int b){
		if(n % b ==0){
			return n;
		}else{
			int large = (n / b + 1) * b;
			int small = n / b * b;
			if(large - n > n - small){
				return small;
			}else{
				return large;
			}
		}
	}
	
}
