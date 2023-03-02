package small;

public class Win 
{
	int n1;
	int n2;
	String name;
	
	Win(String n)
	{
		name=n;
	}
	
	Win()
	{
		n1=55;
		n2=32;
	}
	
	Win(int l,int m)
	{
		n1=l;
		n2=m;
	}
	public void add()
	{
		System.out.println(n1+n2);
	}
	public void Studentname()
	{
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		Win r=new Win();
		r.add();
		
		Win l=new Win(45,37);
		r.add();
		
		Win x=new Win("Maya");
		x.Studentname();
		
	}
	

}
