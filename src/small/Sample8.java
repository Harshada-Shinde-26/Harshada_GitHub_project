package small;

public class Sample8 
{
	int p;
	int q;
	{
		p=100;
		q=25;
		
	}
	public void add()
	{
		System.out.println(p+q);
	}
	public void sub()
	{
		System.out.println(p-q);
	}
    public void multi()
    {
    	System.out.println(p*q);
    }
    public void div()
    {
    	System.out.println(p/q);
    }
    public static void main(String[] args) 
    {
    	Sample8 ref=new Sample8();
    	ref.add();
    	ref.sub();
    	ref.multi();
    	ref.div();
		
	}
}
