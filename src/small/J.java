package small;

public class J 
{
	int n1;
	int n2;
	String name;
	int age;
	
	J(String n)
	{
		name=n;
	}
	J()
	{
		n1=37;
		n2=29;
	}
	J(String l,int a)
	{
		name=l;
		age=a;
	}
	J(int x,int y)
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
	public void Studentinfo()
	{
		System.out.println(name+ age);
	}
	public static void main(String[] args) 
	{
		J h=new J();
		h.Add();
		
		J m=new J(36,21);
		m.Add();
		
		J r=new J("Mina");
		r.Studentname();
		
		J l= new J("Riya"+"22");
		l.Studentinfo();
		
	}

}
