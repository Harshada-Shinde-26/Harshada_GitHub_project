package small;

public class East 
{
	public void m1()
	{
		System.out.println("WBT is perform by Developer...");
	}
	public void m2()
	{
		System.out.println("BBT is perform by Tester...");
	}
	public static void main(String[] args) 
	{
		East r=new East();
		r.m1();
		r.m2();
		
		West ref=new West();
		ref.m3();
		ref.m4();
		
	}
	

	
	

}
