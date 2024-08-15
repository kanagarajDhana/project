package Revise;

public class palindrome_num {

	public static void main(String[] args) {
		
		int a = 515;
		int rem = 0;
		int sum = 0;
		int temp = a;
		 
		while (a!=0)
		{
			rem = a%10;
			sum = (sum*10)+rem;
			a = a/10;
		}
		if(sum == temp)
			
		System.out.println("palindrome");
	}

}
