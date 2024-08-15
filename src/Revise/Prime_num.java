package Revise;

public class Prime_num {

	public static void main(String[] args) {
		
		int a = 10;
		int count =0;
		for (int i=1;i<=a;i++) 
		{
			if (i%a==0) 
			{
				count+=1;
			}
		}
		if (count==2)
		{
			System.out.println("prime");
		}
		else
			System.out.println("not prime");
				
		
		      int b= 100;
		      for (int k=2;k<=b;k++)
		      {
		    	  boolean equal = false;
		    	 for (int l=2;l<k;l++) 
		    	 {
		    		 if(k%l==0)
		    		 {
		    			 equal=true; 
		    		 }
		    	 }
		    	  if(equal==false)
			      {
			    	  System.out.print(k+" ");
			      }
		    	 
		    	 
		      }
		      
		    
		      
	}

}
