package exception;

public class ExcptnHandlng {
	public void display()
	{
		int a=9;
		try {
			int b=a/0;
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcptnHandlng obj=new ExcptnHandlng();
		obj.display();
		System.out.println("hh");

	}

}
