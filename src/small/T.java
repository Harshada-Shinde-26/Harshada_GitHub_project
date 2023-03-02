package small;

public class T 
{
	int n1;
	int n2;
	String name;
	
	T(String n)
	{
	 name=n;	
	}
	
	T()
	{
		n1=43;
		n2=23;
	}
	
	T(int x,int y)
	{
		n1=x;
		n2=y;
	}
	public void Add()
	{
	 System.out.println(n1+n2);	
	}
	public void Studentname()
	{
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		T u=new T();
		u.Add();
		
		T v=new T(76,45);
		v.Add();
		
		T r=new T("Mahi");
		r.Studentname();
	}

}
