 
package Revise;

public class Constructor {
	int c; int d; int b; int a;
	
	public Constructor(int i, int j, int k, int l) {
		a=i;
		b=j;
		c=k;
		d=l;		
	}
	public int add() {
		int h = a+b;
		return h;
	}
   public int sub() {
	   int h = b-a;
		return h;
	}
   public int multi() {
	   int h = d/c;
		return h;
   }
    public int div() {
    	int h = d%a;;
		return h;
	
   }
    public static void main(String[] args) {
    	
    	Constructor c = new Constructor(10,20,30,40);
    	
    	System.out.println(c.add());
    	System.out.println(c.sub());
    	System.out.println(c.multi());
    	System.out.println(c.div());
	}

}
