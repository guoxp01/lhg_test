package hy;

public class Rounder {
	public int round(int n,int b){
		int res =n/b;
		int m = n%b;
		if(m==0){
			return n;
		}else{
			
			int num = n-res*b;
			res+=1;
			int num2 =res*b-n;
			if(num>=num2)
				return res*b;
			else
				return (res-1)*b;
		}
	}
}
