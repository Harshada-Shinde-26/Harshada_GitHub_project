package small;

public class Sample_1 
{
	//default constructor
	
	//defaultconstructor--> provided by compiler
	//use  to copy all the members of class into object
	
	//Sample_1()
	//{
	//}
	 public void m1()
	 {
		 System.out.println("Running method m1");
	 }
	 
	 public void m2()
	 {
		 System.out.println("Running method m2");
	 }
	 public static void main(String[] args) 
	 {
		 Sample_1 s1=new Sample_1();
		 s1.m1();
		 s1.m2();
		 //1.Sample_1 --> Classname-->as a datatype
		 //2.s1-->objectname--> to create empty / blank object
		 //4.Sample_1() -->Clasname()-->use to copy all the memmbers of class into object
		 
	}

}
