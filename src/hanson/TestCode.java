package hanson;

public class TestCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2;
		int power = 4;
		int length = 1 ;
		while(power!=0) {
			length = length*base;
			power--;
			}
		System.out.println(length);
	}

}
