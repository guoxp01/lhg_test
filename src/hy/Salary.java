package hy;

public class Salary {
	public int howMuch(String[] arrival,String[] depature,int wage){
		int h = 0;
		int m = 0;
		int s = 0;
		double sum = 0.0;
		for(int i= 0;i<arrival.length;i++){
			String[] arr = arrival[i].split(":");
			String[] arr2 = depature[i].split(":");
			int[] numArr = new int[arr.length];
			int[] numArr2 = new int[arr.length]; 
			for(int j = 0;j<arr.length;j++){
				numArr[j] = Integer.parseInt(arr[j]);
				numArr2[j] = Integer.parseInt(arr2[j]);
			}			
			if(numArr[0]<=6&&numArr2[0]>6&&numArr2[0]<18){
				int[] newArr = {6,0,0};
				//开始工作时间到06:00:00 1.5倍工资
				s = newArr[2]-numArr[2];
				if(s<0){
					s+=60;
					newArr[1]-=1;
				}
				m = newArr[1]-numArr[1];
				if(m<0){
					m+=60;
					newArr[0]-=1;
				}
				h = newArr[0]-numArr[0];
				sum +=(h+m/60.0+s/3600.0)*wage*1.5;
				
				//06:00:00到离开工作时间  为1倍工资
				newArr[0]=6;
				newArr[1]=0;
				newArr[2] = 0;
				s = numArr2[2]-newArr[2];
				if(s<0){
					s+=60;
					numArr2[1]-=1;
				}
				m = numArr2[1]-newArr[1];
				if(m<0){
					m+=60;
					numArr2[0]-=1;
				}
				h = numArr2[0]-newArr[0];
				sum +=(h+m/60.0+s/3600.0)*wage;
			}else if(numArr[0]<=18&&numArr2[0]>18&&numArr[0]>6){
				int[] newArr = {18,0,0};
				//开始工作时间到18:00:00 1倍工资
				s = newArr[2]-numArr[2];
				if(s<0){
					s+=60;
					newArr[1]-=1;
				}
				m = newArr[1]-numArr[1];
				if(m<0){
					m+=60;
					newArr[0]-=1;
				}
				h = newArr[0]-numArr[0];
				sum +=(h+m/60.0+s/3600.0)*wage;
				
				//18:00:00到离开工作时间  为1.5倍工资
				newArr[0]=18;
				newArr[1]=0;
				newArr[2]=0;
				s = numArr2[2]-newArr[2];
				if(s<0){
					s+=60;
					numArr2[1]-=1;
				}
				m = numArr2[1]-newArr[1];
				if(m<0){
					m+=60;
					numArr2[0]-=1;
				}
				h = numArr2[0]-newArr[0];
				sum +=(h+m/60.0+s/3600.0)*wage*1.5;
			}else if(numArr[0]<=6&&numArr2[0]>=18){
				//工作开始到06:00:00  1.5倍工资
				int[] newArr = {6,0,0};
				s = newArr[2]-numArr[2];
				if(s<0){
					s+=60;
					newArr[1]-=1;
				}
				m = newArr[1]-numArr[1];
				if(m<0){
					m+=60;
					newArr[0]-=1;
				}
				h = newArr[0]-numArr[0];
				System.out.println(h+":"+m+":"+s);
				sum +=(h+m/60.0+s/3600.0)*wage*1.5;
				//18:00:00到离开工作时间  1.5倍工资
				newArr[0]=18;
				newArr[1]=0;
				newArr[2]=0;
				s = numArr2[2]-newArr[2];
				if(s<0){
					s+=60;
					numArr2[1]-=1;
				}
				m = numArr2[1]-newArr[1];
				if(m<0){
					m+=60;
					numArr2[0]-=1;
				}
				h = numArr2[0]-newArr[0];
				sum +=(h+m/60.0+s/3600.0)*wage*1.5;
				sum +=(18-6)*wage;
			}else{				
					s = numArr2[2]-numArr[2];
					if(s<0){
						s+=60;
						numArr2[1]-=1;
					}
					m = numArr2[1]-numArr[1];
					if(m<0){
						m+=60;
						numArr2[0]-=1;
					}
					h = numArr2[0]-numArr[0];
				if(numArr2[0]<=6||numArr[0]>=18){	
					sum +=(h+m/60.0+s/3600.0)*wage*1.5;
				}else if((numArr[0]>=18&&numArr2[0]<24)){
					sum +=(h+m/60.0+s/3600.0)*wage*1.5;
				}else{
					sum +=(h+m/60.0+s/3600.0)*wage;
				}
			}
		}
		int res =(int)sum;
		return res;
	}
}
