package hy;

public class ParallelSpeedup {
	public int numProcessors(int k,int overhead){
		if(k<=overhead){
			return 1;
		}
		
		int num  = (int) Math.sqrt(k);
		int sumTime = k;
		int res = 0;
		int res1 = 0;
		int n = 1;
		int res2 = 0;
		for(int i = 2;i<=num;i++){
			res = k%i;
			res1 = k/i;
			if(res!=0){
				res1+=1;
			}
			res2 = (comTime(i)*overhead)/2+res1;
			if(sumTime>res2){
				sumTime = res2;
				n = i;
			}
		}
		return n;
	}
	
	public int comTime(int i){
		if(i>=18){
			return 2100000000;
		}
		if(i==1){
			return 1;
		}else{	
		return i*comTime(i-1);
		}
	}
}
