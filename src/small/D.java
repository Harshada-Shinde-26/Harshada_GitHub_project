package small;

public class D 
{
	int num1;
	int num2;
	String name;
	
	D(String s)
	{
		name=s;
	}
	D()
	{
		num1=25;
		num2=13;
	}
	D(int a,int b)
	{
		num1=a;
		num2=b;
	}
	public void Studentname()
	{
		System.out.println(name);
	}
	public void Add()
	{
		System.out.println(num1+num2);
	}
	public static void main(String[] args) 
	{
		D r=new D();
		r.Add();
		
		D ref=new D(45,20);
		ref.Add();
		
		D d=new D("Radha");
		d.Studentname();
		
	}
	

}
