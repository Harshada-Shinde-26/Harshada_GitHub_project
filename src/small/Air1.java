package small;

public class Air1 
{
	int num1;
	int num2;
	Air1(int a,int b)
	{
	 num1=a;
	 num2=b;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void sub()
	{
		System.out.println(num1-num2);
	}
	public static void main(String[] args) 
	{
		Air1 r=new Air1(32,25);
		r.add();
		r.sub();
		
	}

}
