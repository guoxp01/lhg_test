package gxp;

public class ParallelSpeedup {
	
	public int numProcessors(int k, int overhead) {
		int minSecode=0;
		int minSize=1;
		//最少一个 最多k个
		for (int i = 1; i <= k; i++) {
			int curSecond=getSize(i)*overhead;
			curSecond+=(k/i)+(k%i>0?1:0);
			System.out.println(curSecond);
			if(minSecode==0||curSecond<minSecode){
				minSecode=curSecond;
				minSize=i;
			}else{
//				break;
			}
		}
		return minSize;
	}
	
	public static void main(String[] args) {
		Long startTime=System.currentTimeMillis(); 
		System.out.println(new ParallelSpeedup().numProcessors(3333 ,2));
		System.out.println(System.currentTimeMillis()-startTime);
	}
	
    public int getSize(int size){
    	int rel=0;
    	for (int i = 0; i < size; i++) {
    		if((size-i!=size)&&size-i>0){
    			rel+=i;
    		}
    	}
    	return rel;
    }
	
}
