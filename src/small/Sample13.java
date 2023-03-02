package small;

public class Sample13 
{
	int num1;
	int num2;
	Sample13(int a,int b)
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
		Sample13 r=new Sample13(72,12);
		r.add();
		r.sub();
		
	}
}
