package small;

public class Air2 
{
	int num1;
	int num2;
	Air2(int a,int b)
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
		Air2 r=new Air2(45,32);
		r.add();
		r.sub();
	
	}
	

}
