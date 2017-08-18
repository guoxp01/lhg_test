package hy;

public class StreetParks {
	public int freeParks(String street){
		
		int num = 0;
		for(int i=0;i<street.length();i++){
			if(street.charAt(i)=='S'){
				if((i+1)<street.length()&&street.charAt(i+1)=='-'){
					i++;
				}
			}else if(street.charAt(i)=='B'){
				
			}else if(street.charAt(i)=='D'){
				
			}else{
				if((i+2)<street.length()&&street.charAt(i+2)=='B'){
					i+=2;
				}else if((i+1)<street.length()&&street.charAt(i+1)=='S'){	
				
				}else{
					num++;
				}
			}
		}		
		return num;
	}
}
