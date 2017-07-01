package test;

import java.lang.reflect.Method;


public class Test {
	public static void main(String[] args) throws Exception {
//		System.out.println(testsub(gxp.Substitute.class));
//		System.out.println(testparup(gxp.ParallelSpeedup.class));
		
//		System.out.println(testsub(htf.Substitute.class));
//		System.out.println(testparup(htf.ParallelSpeedup.class));	\
		
//		System.out.println(testsub(lmk.Substitute.class));
//		System.out.println(testparup(htf.ParallelSpeedup.class));	
		
		
//		System.out.println(testsub(lsg.Substitute.class));
//		System.out.println(testparup(lsg.ParallelSpeedup.class));	
		
//		System.out.println(testsub(lxh.Substitute.class));
		
//		System.out.println(testsub(lsg.Substitute.class));
//		System.out.println(testparup(lsg.ParallelSpeedup.class));	
		
//		System.out.println(testsub(wsj.Substitute.class));
		//error
//		System.out.println(testparup(wsj.ParallelSpeedup.class));
		
//		System.out.println(testsub(yd.Substitute.class));
		System.out.println(testparup(yd.ParallelSpeedup.class));
		
//		System.out.println(testsub(yjc.Substiute.class));
		
	}
	
	public static <T> boolean testparup(Class<T> clasz) throws Exception{
		int[] p1 ={12,50,9,3333,1000000};
		int[] p2 = {1,3,10,2,10};
		int[] rel = {2,3,1,12,47};
		T instance = clasz.newInstance();
		Method method=clasz.getMethod("numProcessors", int.class,int.class);
		for (int i = 0; i < rel.length; i++) {
			Long startTLong =System.currentTimeMillis();
			System.out.println(startTLong);
			int cc=Integer.parseInt(method.invoke(instance, p1[i],p2[i])+"");
			if(cc!=rel[i]||System.currentTimeMillis()-startTLong>2000){
				System.out.println(System.currentTimeMillis()-startTLong);
				System.out.println("被检查人:"+clasz.getClass());
				System.out.println("源码:"+clasz.getClass());
				System.out.println("用例:{\""+p1[i]+"\",\""+p2[i]+"\"}");
				break;
			}
		}
		System.out.println(clasz);
		return true;
	}
	
	
	public static <T> boolean testsub(Class<T> clasz) throws Exception{
		String[] p1 ={"TRADINGFEW","ABCDEFGHIJ","CRYSTALBUM"};
		String[] p2 = {"LGXWEV","XJ","MMA"};
		String[] rel = {"709","0","6"};
		T instance = clasz.newInstance();
		Method method=clasz.getMethod("getValue", String.class,String.class);
		for (int i = 0; i < rel.length; i++) {
			String cc=method.invoke(instance, p1[i],p2[i])+"";
			if(!cc.equals(rel[i])){
				System.out.println("被检查人:"+clasz.getClass());
				System.out.println("源码:"+clasz.getClass());
				System.out.println("用例:{\""+p1[i]+"\",\""+p2[i]+"\"}");
				break;
			}
		}
		System.out.println(clasz);
		return true;
	}
	
}
