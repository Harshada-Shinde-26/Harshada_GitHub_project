package small;

public class Sample5 
{
	int num1;
	int num2;
{
	num1=80;
	num2=20;
}
 public void Add()
 {
	 System.out.println(num1+num2);
 }
 public void Sub()
 {
	 System.out.println(num1-num2);
 }
public void multi()
{
	System.out.println(num1*num2);
}
public void Div()
{
	System.out.println(num1/num2);
} 
public static void main(String[] args) 
{
	Sample5 ref= new Sample5();
	ref.Add();
	ref.Sub();
	ref.multi();
	ref.Div();
}
	
}