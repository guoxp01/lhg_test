package hy;

public class FormatAmt {
	
	public String amount(int dollars,int cents){
		if(dollars>2000000000||dollars<0){
			return "输入美元的数字不对,请确认后再";
		}
		if(cents>99||cents<0){
			return "输入美分的数字不对,请确认后输入";
		}
		String dollarsStr = String.valueOf(dollars);
		String centsStr = String.valueOf(cents);
		StringBuffer sb = new StringBuffer();
		int i = 0;
		for(i=dollarsStr.length();i>3;i-=3){
			sb.insert(0, dollarsStr.substring(i-3,i));
			sb.insert(0, ",");
		}
		sb.insert(0, dollarsStr.substring(0,i));
		sb.insert(0, "$");
		sb.append(".");		
		if(centsStr.length()==1){			
			sb.append("0");
		}
		sb.append(centsStr);
		return "\""+sb.toString()+"\"";
		
	}
}
