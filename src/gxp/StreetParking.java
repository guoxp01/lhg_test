package gxp;


public class StreetParking {
	//1、不在私人车道。 2、不在公共汽车站。 3、不在公共汽车站前 10 米以内处。 4、不在小街车道。 5、不在小街车道前 5 米以内处。 6、不在小街车道后 5 米以内处
	//'D' 表示私人车道，'B'表示巴士站，'S'表示小街车道和'-'表示其他类型的街道
	public int freeParks(String street){
		int size=0;
		for (int i = 0; i < street.length(); i++) {
			String cur=street.charAt(i)+"";
			if(!cur.equals("D")//1、不在私人车道
				&&!cur.equals("B")//2、不在公共汽车站
				&&((i+1<street.length()?!(street.charAt(i+1)+"").equals("B"):true)//3、不在公共汽车站前 10 米以内处。
				&&(i+2<street.length()?!(street.charAt(i+2)+"").equals("B"):true))//3、不在公共汽车站前 10 米以内处。
				&&!cur.equals("S")// 4、不在小街车道。
				&&(i+1<street.length()?!(street.charAt(i+1)+"").equals("S"):true)//5、不在小街车道前 5 米以内处。
				&&(i-1>=0?!(street.charAt(i-1)+"").equals("S"):true)//6、不在小街车道后 5 米以内处
				)
			size++;
		}
		return size; 
	}
}
