package gxp;

public class Rounder {
	public int round(int n, int b) {
		return n%b*1.0/b>=0.5?n-n%b+b:n-n%b;
	}
}
