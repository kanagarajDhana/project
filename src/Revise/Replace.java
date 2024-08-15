package Revise;

public class Replace {

	public static void main(String[] args) {
	
		String a = "mysore";
		
		String b ="";
		int c = a.length();
		
		for (int i=c-1;i>=0;i--) {
			
			b+=a.charAt(i);	
		
		}
		
		System.out.println(b);
	
	}

}
