package hanson;

public class Program3 {

	public static void main(String[] args) {
		
		int base= 2;
		int power= -4;
		int result = 1;
		while (power!=0) {
			result= result*base;
			power--;
		}
		System.out.println(+result);
		

	}

}
