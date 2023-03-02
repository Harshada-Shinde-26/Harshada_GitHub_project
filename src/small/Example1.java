package small;

public class Example1 
{
	int num1;
	int num2;
    String name;
	
	Example1(String s1)
	{
		name=s1;
	}
	Example1()
	{
		num1=20;
		num2=30;
	}
	Example1(int a,int b)
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
		Example1 r=new Example1();
		r.Add();
		
		Example1 ref=new Example1(12,8);
		ref.Add();
		
		Example1 e1=new Example1("Priya");
		e1.Studentname();
		
	}

}


