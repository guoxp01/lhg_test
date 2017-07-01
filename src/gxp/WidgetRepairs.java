package gxp;
/**
问题描述 
某快餐店，到达的顾客排队等候，服务员处理完一位顾客的点餐之后接着处理下一位顾 客的点餐。因此给定一个数组 arrival 表示一组顾客的到达时间，给定另一个数组 service 表 示服务员为每位顾客处理点餐的用时，我们想知道在这组顾客中等待最久的顾客等待的时 长。  
创建一个类 BigBurger 包含一个方法 maxWait ，使用一个 int[]参数 arrival 和一个 int[] 参数 service，arrival 和 service 对应的同一元素分别表示同一顾客在快餐店营业后到达的 时间和服务员为其处理点餐服务的时间。返回等待最久的那位顾客的等待时长。  

定义 Java 
包名： 自己名字的缩写，如：package lhg; 类名： BigBurger 方法： maxWait 参数： int[],int[] 返回值： int 方法签名： public int maxWait(int[] arrival, int[] service)  
JavaScript 
文件名： BigBurger.js 函数名： maxWait 参数： 数字数组,数字数组 返回值： 数字 方法签名： function maxWait(arrivals, service)   
约束 
1. 参数 arrival 数组包含的元素数量只会在 1 到 50 之间（包含 1 和 50），其中每一 个元素的数值只会在 1-720 之间 （包含 1 和 720），并且数组的元素值只会以升 序排列。 2. 参数 service 包含的元素数量和 arrival 相同，并且每一个元素的数值只会在 1-15 之间 （包含 1 和 15）  
示例 
输入 返回 
{3,3,9},{2,15,14} 11 说明：两名顾客在时间 3 到达. 第一名顾客等待时长为 0, 他 的点餐处理时间为2, 他的点餐在时间5处理完. 而第二名顾 客的点餐在时间 5 开始处理（等到第一名顾客处理完），因此 他的等待时长为 2（从时间 3 到时间 5），并在时间 20 处理 完。之后最后一名顾客的点餐在时间 20 开始处理，他的等 待时长为 11（从时间 9 等到时间 20）并且在时间 34（20+14） 处理完。因此等待时间最长的顾客为第 3 名顾客，他的等待

时长为 11，所以方法返回 11。 {182},{11} 0 说明：只有一名顾客，所以无需等待，等待时长为 0。 {2,10,11},{3,4,3} 3 说明：只有第三名顾客需要从时间 11 等待到时间 14，所以 返回 14-11=3。 {2,10,12},{15,1,15} 7  
 */
public class WidgetRepairs {
	
	public int days(int[] arrivals, int numPerDay) {
		int overflow=0;
		int needDays=0;
		for (int i = 0; i < arrivals.length; i++) {
			int todayCount=overflow+arrivals[i];
			if(todayCount>0){
				needDays++;
			}
			overflow=todayCount-numPerDay;
			overflow=overflow<0?0:overflow;
		}
		needDays+=overflow/numPerDay+(overflow%numPerDay>0?1:0);
		return needDays;
	}
	
}
