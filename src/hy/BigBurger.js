function maxWait(arrivals,service){
	var waitTime = 0;
	var maxWaitTime = 0;
	for(var i = 0;i<arrival.length-1;i++){
		if(waitTime+arrival[i]+service[i]-arrival[i+1]<0){
			continue;
		}
		waitTime = waitTime+arrival[i]+service[i]-arrival[i+1];
		if(waitTime>maxWaitTime){
			maxWaitTime = waitTime;
		}
	}		
	return maxWaitTime;
}
