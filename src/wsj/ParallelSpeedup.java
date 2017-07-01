package wsj;

public class ParallelSpeedup {
	public int numProcessors(int k,int overhead){
		int a = 0;
		int b = 0;
		int c =0;
		int d = 0;
		for(int i = 1;i<=k;i++){
			a = i*(i-1)*overhead/2;
			b = k%i==0? k/i : (k/i+1);
			if(c==0||c>a+b){
				c = a+b;
				d = i;
			}
		}
		return d;
	}
}
