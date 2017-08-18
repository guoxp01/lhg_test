function isOne(words){
	for(var i = 0;i<words.length;i++){
		for(var j = 0;j<words.length;j++){
			if(i == j){
				continue;
			}
			if(words[i].startsWith(words[j])){
				return "\"No, "+j+"\"";
			}
		}
	}
	return "\"Yes\"";
}
