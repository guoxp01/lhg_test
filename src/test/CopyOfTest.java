package test;

import java.lang.reflect.Method;


public class CopyOfTest {
	public static void main(String[] args) throws Exception {
		System.out.println(testsub(gxp.Substitute.class));
		System.out.println(testparup(gxp.ParallelSpeedup.class));
	}
	
	public static <T> boolean testparup(final Class<T> clasz) throws Exception{
		final int[] p1 ={12,50,9,3333,1000000};
		final int[] p2 = {1,3,10,2,10};
		final int[] rel = {2,3,1,12,47};
		final T instance = clasz.newInstance();
		final Method method=clasz.getMethod("numProcessors", int.class,int.class);
		aa:
		for (int i = 0; i < rel.length; i++) {
			final Long startTLong =System.currentTimeMillis();
			final int curi=i;
			
			Thread t=new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						int cc = Integer.parseInt(method.invoke(instance, p1[curi],p2[curi])+"");
						if(cc!=rel[curi]){
							System.out.println("被检查人:"+clasz.getClass());
							System.out.println("源码:"+clasz.getClass());
							System.out.println("用例:{\""+p1[curi]+"\",\""+p2[curi]+"\"}");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			t.run();;
			while(t.isAlive()){
				if(System.currentTimeMillis()-startTLong>2000){
					System.out.println("被检查人:"+clasz.getClass());
					System.out.println("源码:"+clasz.getClass());
					System.out.println("用例:{\""+p1[curi]+"\",\""+p2[curi]+"\"}");
					t.stop();
					break aa;
				}
				Thread.sleep(10);
			}
			t.stop();
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
