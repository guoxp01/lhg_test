package gxp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Sets {
	public int[] operate(int[] a, int[] b, String operation) {
		int []rle={};
		Set<Integer>set=new HashSet<Integer>();
		Integer [] aInteger=new Integer[a.length];
		for (int i = 0; i < aInteger.length; i++) {
			aInteger[i]=a[i];
		}
		Integer [] bInteger=new Integer[b.length];
		for (int i = 0; i < bInteger.length; i++) {
			bInteger[i]=b[i];
		}
		
		if("UNION".equals(operation)){
			set.addAll(Arrays.asList(aInteger));
			set.addAll(Arrays.asList(bInteger));
		}else if("INTERSECTION".equals(operation)){
			int[] uni=operate(a, b, "UNION");
			List<Integer> alist=Arrays.asList(aInteger);
			List<Integer> blist=Arrays.asList(bInteger);
			for (int i:uni) {
				if(alist.contains(i)&&blist.contains(i)){
					set.add(i);
				}
			}
		}else if("SYMMETRIC DIFFERENCE".equals(operation)){
			int[] uni=operate(a, b, "UNION");
			List<Integer> alist=Arrays.asList(aInteger);
			List<Integer> blist=Arrays.asList(bInteger);
			for (int i:uni) {
				if((!alist.contains(i)&&blist.contains(i))
						||(alist.contains(i)&&!blist.contains(i))){
					set.add(i);
				}
			}
		}
		
		if(set.size()>0){
			rle=new int[set.size()];
			int i=0;
			for (int r:set) {
				rle[i]=r;
				i++;
			}
			Arrays.sort(rle);
		}
		return rle;
	}
}
