package small;

public class Sky 
{
	public void r1()
	{
		System.out.println("Today is Monday...");
	}
	public void r2()
	{
		System.out.println("Tommorow will Tuesday...");
	}
	public static void main(String[] args) 
	{
		Sky s1=new Sky();
		s1.r1();
		s1.r2();
		
		Sky2 ref=new Sky2();
		ref.r3();
		ref.r4();
		
	}

}
