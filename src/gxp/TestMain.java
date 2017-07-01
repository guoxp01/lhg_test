package gxp;

public class TestMain {
	public static void main(String[] args) {
		String date="02/17";
		String[] birthdays={"09/14 Loraine","02/17 Wernie","10/12 Stefan"};
		System.out.println(new Birthday().getNext(date, birthdays));
	}
}
