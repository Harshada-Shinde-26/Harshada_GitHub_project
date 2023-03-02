package small;

public class Run 
{
	int num1;
	int num2;
	String name;
	
	Run(String n)
	{
		name=n;
	}
	Run()
	{
		num1=46;
		num2=39;
	}
	Run(int x,int y)
	{
		num1=x;
		num2=y;
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
		Run r=new Run();
		r.Add();
		
		Run l=new Run(56,28);
		l.Add();
		
		Run y=new Run("Sweta");
		y.Studentname();
		
	}

}
