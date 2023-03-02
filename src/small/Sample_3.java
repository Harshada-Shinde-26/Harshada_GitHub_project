package small;

public class Sample_3 
{
	//example of user defined without zero parameter constructor 
	 
	//Step1:Variable Declaration
	int num1;
	int num2;
	
	//Step2:Variable initialization
	//Sample_3()    //without /zero parameter constructor
	{
		num1=20;
		num2=25;
	}
	public void addition()
	{
		System.out.println(num1+num2);
	}
	public void multiplication()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args) 
	{
		Sample_3 s3=new Sample_3();
		s3.addition();
		s3.multiplication();
		
	}
}
