package hy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Sets {
	public int[] operate(int[] a,int[] b,String operation){
		Set<Integer> set = new TreeSet<Integer>();
		List<Integer> aList = Arrays.stream( a ).boxed().collect(Collectors.toList());
		List<Integer> bList = Arrays.stream( b ).boxed().collect(Collectors.toList());
		switch(operation){
		case "UNION": 
			set.addAll(aList);
			set.addAll(bList);
			break;
		case "INTERSECTION":
			for(int i=0;i<a.length;i++){
				for(int j=0;j<b.length;j++){
					if(a[i]==b[j]){
						set.add(a[i]);
					}
				}
			}
			break;
		case "SYMMETRIC DIFFERENCE":
			set.addAll(aList);
			set.addAll(bList);
			Set set1 = new TreeSet<Integer>();
			for(int i=0;i<a.length;i++){
				for(int j=0;j<b.length;j++){
					if(a[i]==b[j]){
						set1.add(a[i]);
					}
				}
			}
			for(int i=0;i<set1.size();i++){
				set.removeAll(set1);
			}
			break;
		}
		Object[] array = set.toArray();
		int[] union = new int[array.length];
		for(int i=0;i<union.length;i++){
			union[i]=(Integer)array[i];
		}
			 return union;
	}
}
