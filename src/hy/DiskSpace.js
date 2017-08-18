function minDrives(used,total){
	total.sort();
	var j = 0;
	var res = 0;
	var num = 0;
	boolean flag = false;
	for(var i = total.length-1;i>=0;i--){
		flag = false;
		for(;j<used.length;j++){
			flag = true;
			res = total[i]-used[j];
			if(res>0){
				total[i] = res;
			}else if(res < 0){
				used[j] = used[j]-total[i];
				break;
			}else{
				j++;
				break;
			}
		}
		if(flag){
			num++;
		}
	}
	return num;
}