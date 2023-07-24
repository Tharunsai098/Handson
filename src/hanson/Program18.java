package hanson;

import java.util.List;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> tharun = List.of(1,5,5,7,4,9,-1,-3);
		
		List<Integer> tharun1=tharun.stream().filter(i->i.equals(5)).toList();
		System.out.println(tharun1);
		
//		List<Integer> tharun2= tharun.stream().filter(i->i<0).toList();
//		System.out.println(tharun2);
		

	}

}
