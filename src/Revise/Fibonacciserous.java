package Revise;

public class Fibonacciserous {

	public static void main(String[] args) {

		int a =20;
		int n =0;
		int n1=0;
		int n2=1;
		
		for(int i=0;i<=a;i++)
		{
			n = n1+n2;
			n1=n2;
			n2=n;
			System.out.print(n1+" ");
		}
	}

}
