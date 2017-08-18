function getNext(date,birthdays){
	var dates = date.split("/");
	var m = 0;
	var d = 0;
	var num = 0;
	for(var i = 0;i<birthdays.length;i++){
		var births = birthdays[i].split(" ")[0].split("/");
		var m1 = births[0].compareTo(dates[0]);
		var d1 = births[1].compareTo(dates[1]);
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