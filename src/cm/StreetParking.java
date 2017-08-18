package cm;

public class StreetParking {

	public static void main(String[] args) {
		String street = "--S--S--S--S--";
		StreetParking streetParking = new StreetParking();
		int total = streetParking.freeParks(street);
		System.out.println(total);
	}
	
	public int freeParks(String street){
		int total = 0;
		boolean[] flags = new boolean[street.length()];
		for(int i = 0;i < street.length(); i ++){
			if(street.charAt(i) == 'D'){
				flags[i] = true;
			}
			if(street.charAt(i) == 'B'){
				for(int j = i; j > i - 3 && j >= 0; j --){
					flags[j] = true;
				}
			}
			if(street.charAt(i) == 'S'){
				for(int j = i - 1; j < i + 2 && j >= 0 && j < street.length(); j ++){
					flags[j] = true;
				}
			}
		}
		for(int i = 0; i < flags.length; i ++){
			if(flags[i] == false)
				total ++;
		}
		return total;
	}
	
}
