package small;

public class Sample2 
{
	public void s1()
	{
		System.out.println("Running method s1");
	}
	public void s2()
	{
		System.out.println("Running method s2");
	}
	public static void main(String[] args) 
	{
		Sample2 ref= new Sample2();
		ref.s1();
		ref.s2();
		
	}

}
