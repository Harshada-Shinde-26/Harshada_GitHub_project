package small;

public class Sample11 
{
	int num1;
	int num2;
	Sample11(int a,int b)
	{
		num1=a;
		num2=b;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void multi()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args) 
	{
		Sample11 r=new Sample11(10,20);
		r.add();
		r.multi();
		
	}

}
