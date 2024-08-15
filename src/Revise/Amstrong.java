package Revise;

public class Amstrong {

	public static void main(String[] args) {
		
		
		int a = 153;
		int rem =0;
		int sum= 0;
		int temp = a;
		while(a!=0)
		{
			rem = a%10;
			sum =sum+(rem*rem*rem);
			a=a/10;
			
		}
		if (temp==sum)
		{
			System.out.println("it is amstrong number");
		}
		
	}

}
