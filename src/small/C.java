package small;

public class C 
{
	int num1;
	int num2;
	String name;
	
	C(String n)
	{
		name=n;
	}
	C()
	{
		num1=34;
		num2=27;
	}
	C(int p,int q)
	{
		num1=p;
		num2=q;
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
		C r=new C();
		r.Add();
		
		C l= new C(56,34);
		l.Add();
		
		C k= new C("Usha");
		k.Studentname();
	}
	

}
