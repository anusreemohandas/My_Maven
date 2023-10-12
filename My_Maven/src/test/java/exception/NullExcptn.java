package exception;

public class NullExcptn {
	
	public void print()
	{
		String s=null;
		try
		{
			int a;
			a=s.length();
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullExcptn obj=new NullExcptn();
		obj.print();

	}

}
