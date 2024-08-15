package Revise;

public class Str_palindrome {

	public static void main(String[] args) {
		
		
		String a ="chennai";
		
		StringBuilder s =  new StringBuilder(a);
		 s.reverse();
		 String rev = s.toString();
		 
		 if (a.equals(rev))
		 {
			 System.out.println("palindrome");
		 
		 }
		 else {
			System.out.println("not palindrome");
		}
		

	}

}
