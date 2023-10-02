package Sample;

public class Grade {
	public void grade()
	{
		int m=16;
		if(m<40)
		{
			System.out.println("Failed");
		}
		else if(m==40||m<=60)
		{
			System.out.println("D");
		}
		else if(m==61||m<=70)
		{
			System.out.println("C");
		}
		else if(m==71||m<=80)
		{
			System.out.println("B");
		}
		else if(m==81||m<=100)
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("Invalid mark");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade obj = new Grade();
		obj.grade();

	}

}
