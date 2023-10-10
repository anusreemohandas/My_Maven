package abstractsample;

public class SampleClass extends AbstractClass{
	public void print()
	{
		System.out.println("Abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass obj=new SampleClass();
		obj.display();
		obj.print();		

	}

}
