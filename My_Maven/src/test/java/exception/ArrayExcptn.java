package exception;

public class ArrayExcptn {
	public void arr()
	{
		try 
		{
			int a[]= {1,2,3,4};
			//System.out.println(a[4]);
			for(int i=0;i<=5;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExcptn obj=new ArrayExcptn();
		obj.arr();

	}

}
