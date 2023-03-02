package small;

public class A1 
{
	int num1;
	int num2;
	String name;
	
	A1(String s)
	{
		name=s;
	}
	A1()
	{
		num1=35;
		num2=22;
	}
	A1(int a, int b)
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
		A1 r=new A1();
		r.Add();
		
		A1 ref=new A1(24,13);
		ref.Add();
		
		A1 a=new A1("Sneha");
		a.Studentname();
		
	}

}
