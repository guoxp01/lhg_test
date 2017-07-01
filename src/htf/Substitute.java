package htf;

import java.util.HashMap;
import java.util.Map;

public class Substitute 
{
	public int getValue(String key, String code)
	{
		Map<String, String> map = new HashMap<String, String>();
		String[] k = key.split("");
		for(int i=1;i<k.length;i++)
		{
			map.put(k[i], i+"");
			if(i == k.length-1)
				map.put(k[i], "0");
		}
		String r = "";
		for(String c: code.split(""))
		{
			if(!c.equals("") && map.containsKey(c))
				r += map.get(c);
		}
		return Integer.parseInt(r);
	}
}
