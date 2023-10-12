package exception;

public class Sample {
	public void testthrow(int age) throws LicenceException
	{
		if(age<18)
		{
			throw new LicenceException("Not Eligible"); 
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj=new Sample();
		try {
			obj.testthrow(15);
		} catch (LicenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
