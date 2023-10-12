package exception;

public class ThrowExcptn {
	public static void testthrow(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible"); 
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testthrow(15);
		

	}

}
