package hy;

public class Birthday {
	public String getNext(String date,String[] birthdays){
		String[] dates = date.split("/");
		int m = 0;
		int d = 0;
		int num = 0;
		for(int i = 0;i<birthdays.length;i++){
			String[] births = birthdays[i].split(" ")[0].split("/");
			int m1 = births[0].compareTo(dates[0]);
			int d1 = births[1].compareTo(dates[1]);
			if(m1==0&&i==0){
				d = d1;
				num = i;
			}else if(m1==0&&d1<d){
				d = d1;
				num = i;
			}else if(m1>0&&i==0){
				m = m1;
				d = d1;
				num = i;
			}else if(m1>0&&m1<m){
				m = m1;
				d = d1;
				num = i;
			}else if(m1>0&& m1 == m){
				if(d1>0&&d1<d){
					num  = i ;
				}
			}else if(m1>0&&m<0){
				m = m1;
				d = d1;
				num = i;
			}else if(m1<0&&i==0){
				m = m1;
				d = d1;
				num = i;
			}else if (m1<0&&m1>m ){
				m = m1;
				d = d1;
				num = i;
			}
		}
		return birthdays[num].split(" ")[0];
	}
}
