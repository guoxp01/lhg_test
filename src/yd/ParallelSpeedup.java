package yd;

public class ParallelSpeedup {
	public int numProcessors(int k, int overhead){
		if(k<=overhead)return 1;
		int sj=k;
		int num=k;
		for (int i = 2; i <=k; i++) {
			int tx=0;
			for (int j = 1; j < i; j++) {
				tx+=j;
			}
			int nowSj=(tx*overhead)+(k/i);
			if(sj>nowSj || (sj==nowSj && i<num)){
				sj=nowSj;
				num=i;
			}
		}
		return num;
	}
}
