package gxp;

/**
问题描述 
当一个电子部件坏了，它会被送到电子维修店维修，但维修店每天只能修复一定数量的 电子部件。给你一份每天早上送达维修店进行维修的部件数量的记录单，你的任务是编写一 段程序以确定维修店需要营业多少天才能修理所有的电子部件，如果某一天维修店没有坏的 部件进行维修则当天不必计入营业天数。  
举例，假设维修店每天能够修复最多 8 件，在后面 5 天，它分别接收 10，0，0，4 和 20 个要维修的部件。那么维修店将于第 1 日和第 2 日营业以修好第一天的 10 件，在第 3 天休息，并在第 4 日至第 7 日再次营业以维修后面的部件。因此维修店将总共营业 6 天（分 别是第 1 天，第 2 天，第 4 天到第 7 天）来修复所有部件。  
创建一个类 WidgetRepairs 包含一个方法 days，使用一个 int[]参数表示一段时间内每 天送达维修店的部件数量，使用一个 int 值表示维修店每天的修理数量，请按照上述要求返 回维修店需要营业几天才能完成修理。  
定义 Java 
包名： 自己名字的缩写，如：package lhg; 类名： WidgetRepairs 方法： days 参数： int[],int 返回值： int 
方法签名： public int days(int[] arrivals, int numPerDay)  
JavaScript 
文件名： WidgetRepairs.js 函数名： days 参数： 数字数组,数字 返回值： 数字 方法签名： function days (arrivals, numPerDay)  
约束 
1. 参数 arrivals 数组包含的元素数量只会在 1 到 20 之间（包含 1 和 20），并且每一 个元素的数值只会在 0-100 之间 （包含 0 和 100） 2. 参数 numPerDay 输入值只会在 1 到 50 之间（包含 1 和 50）  
示例 
输入 返回 
{ 10, 0, 0, 4, 20 },8 6 { 0, 0, 0 },10 0 { 100, 100 },10 20 { 27, 0, 0, 0, 0, 9 },9 4 { 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6 },3 15  
 */
public class BigBurger {
	
	public int maxWait(int[] arrival, int[] service) {
		int maxWaitTime=0;
		int curTime=arrival[0];
		for (int i =0; i < arrival.length; i++) {
			if(curTime<arrival[i]){
				curTime=arrival[i];
			}
			int curWaitTime=curTime-arrival[i];
			if(maxWaitTime<curWaitTime){
				maxWaitTime=curWaitTime;
			}
			curTime+=service[i];
		}
		
		return maxWaitTime;
	}
	
}
