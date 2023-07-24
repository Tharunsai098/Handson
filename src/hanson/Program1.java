package hanson;

public class Program1 {
	public static void main(String args[]) {
		
		String s = "abcd";
		String s1 = "badc";
		if(s.length()!=s1.length())
	        {
	            System.out.println("Not a Rotation ");
	            System.exit(0);
	            
	        }
	        String s2=s+s;
	        if(s2.indexOf(s1)!=-1)
	        {
	            System.out.println("Its a Rotation");
	        }
	        else {
	        	System.out.println("Its Not a Rotation");
	        }
		
	}
}