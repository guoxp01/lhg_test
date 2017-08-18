package cm;

import java.util.Arrays;

public class Sets {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {3,4,5,6};
		String operation = "sysmetric difference";
		int[] result = operate(a, b, operation);
		for(int i: result){
			System.out.println(i);
		}
	}
	
	public static int[] operate(int[] a, int[] b, String operation){
		int[] result = new int[0];
		int len = 0;
		if("union".equals(operation)){
			for(int i = 0; i < a.length; i++){
				result = Arrays.copyOf(result, result.length + 1);
				result[len] = a[i];
				len ++;
			}
			boolean[] flags = new boolean[b.length];
			for(int i = 0; i < b.length; i ++){
				for(int j = 0; j < a.length; j++){
					if(b[i] == a[j]){
						flags[i] = true;
					}
				}
			}
			for(int i = 0; i < b.length; i ++){
				if(flags[i] == false){
					result = Arrays.copyOf(result, result.length + 1);
					result[len] = b[i];
					len++;
				}
			}
		}
		if("intersection".equals(operation)){
			boolean[] flags = new boolean[a.length];
			for(int i = 0; i < a.length; i ++){
				for(int j = 0; j < b.length; j++){
					if(a[i] == b[j]){
						flags[i] = true;
					}
				}
			}
			for(int i = 0; i < a.length; i ++){
				if(flags[i] == true){
					result = Arrays.copyOf(result, result.length + 1);
					result[len] = a[i];
					len ++;
				}
			}
		}
		if("sysmetric difference".equals(operation)){
			boolean[] flags = new boolean[a.length];
			for(int i = 0; i < a.length; i ++){
				for(int j = 0; j < b.length; j++){
					if(a[i] == b[j]){
						flags[i] = true;
					}
				}
			}
			for(int i = 0; i < a.length; i ++){
				if(flags[i] == false){
					result = Arrays.copyOf(result, result.length + 1);
					result[len] = a[i];
					len ++;
				}
			}
		}
		return result;
	}
	
}
