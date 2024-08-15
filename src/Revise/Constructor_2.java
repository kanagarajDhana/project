package Revise;

public class Constructor_2 {
	int a;
	int a1;
	int a3;
	int a4;
	int a5;
	int a6;
	public Constructor_2(int i, int j, int k, int l, int m, int n) {
		  a=i;
		  a1=j;
		  a3=k;
		  a4=l;
		  a5=m;
		  a6=n;  
	}  
	public int tvs()
      {
		System.out.println("tvs 50 cc");
		int tvs = a+a1;
		return tvs;
      }
	  public int xl()
      {
		  System.out.println("xl 100 cc");
			int xl = a3+a4;
			return xl;
      }
	  public int hero()
      {
   	   System.out.println("Splender+ 100cc");
   	   int hero = a3+a4;
   	   return hero;
      }
	  public int honda()
      {
   	   System.out.println("unicron 120 cc" );
   	          int honda =a5+a6;
   	         return honda;
      }
	public static void main(String[] args) {

		Constructor_2 c = new Constructor_2(25,25,50,50,60,60);
		System.out.println(c.tvs());
		System.out.println(c.xl());
		System.out.println(c.hero());
		System.out.println(c.honda());
	}

}
