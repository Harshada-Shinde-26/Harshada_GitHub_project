package small;

public class W 
{
	int num1;
	int num2;
	String name;
	
	W(String n)
	{
		name=n;
	}
	W()
	{
		num1=34;
		num2=27;
	}
    W(int a,int b)
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
    	W r=new W();
    	r.Add();
    	
    	W w=new W(12,8);
    	w.Add();
    	
    	W ref=new W("Shyam");
    	ref.Studentname();
		
	}
}
