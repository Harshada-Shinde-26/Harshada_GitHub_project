package small;

public class Sample6 
{
	int a;
	int b;
	{
      a=52;
      b=33;
	}
		public void add()
		{
			System.out.println(a+b);
		}
		public void sub()
		{
			System.out.println(a-b);	    }
		public void multi()
		{
			System.out.println(a*b);
		}
		public void div()
		{
			System.out.println(a/b);
		}
		public static void main(String[] args) 
		{
			Sample6 r=new Sample6();
			r.add();
			r.sub();
			r.multi();
			r.div();
		}
}
