package small;

public class Q 
{
	int num1;
	int num2;
	String name;
	
	Q(String g)
	{
		name=g;
	}
	Q()
	{
	 num1=33;
	 num2=25;
	}
	Q(int a,int b)
	{
		num1=a;
	    num2=b;
	}
	public void Add()
	{
		System.out.println(num1+num2);
	}
	public void Studentname()
	{
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		Q r=new Q();
		r.Add();
		
		Q n=new Q(72,45);
		n.Add();
		
		Q p=new Q("Ram");
		p.Studentname();
		
	}
	

}
