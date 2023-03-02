package small;

public class Sample4 
{
	int num1;
	int num2;
	{
		 num1=35;
		 num2=22;
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
        public static void main(String[] args) 
        {
        	Sample4 s4=new Sample4();
        	s4.Add();
        	s4.Sub();
        	s4.multi();
			
		}
		
		
	}


