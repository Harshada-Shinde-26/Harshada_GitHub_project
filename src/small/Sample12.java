package small;

public class Sample12 
{
	int num1;
	int num2;
     Sample12(int a,int b)
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
	 public void sub()
	 {
		 System.out.println(num1-num2);
	 }
	 public static void main(String[] args) 
	 {
		 Sample12 r=new Sample12(40,20);
		 r.add();
		 r.multi();
		 r.sub();
		
	}
}
