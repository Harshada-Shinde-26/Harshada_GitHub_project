package small;

public class As 
{
	int num1;
	int num2;
	String name;
	
	As(String l)
	{
		name=l;
	}
   As()
   {
	 num1=23;
	 num2=17;
   }
   As(int a,int b)
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
	As r=new As();
	r.Add();
	
	As n=new As(45,21);
	n.Add();
	
	As t=new As("Komal");
	t.Studentname();
}
}
