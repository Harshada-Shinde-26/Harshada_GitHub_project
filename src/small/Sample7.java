package small;

public class Sample7 
{
	int x;
	int y;
	{
		x=72;
		y=36;
	}
	public void add()
	{
		System.out.println( x+y);
	}
	public void sub()
	{
		System.out.println( x-y);
	}
	public static void main(String[] args) 
	{
		Sample7 s7=new Sample7();
		s7.add();
		s7.sub();
		
	}
	

}
