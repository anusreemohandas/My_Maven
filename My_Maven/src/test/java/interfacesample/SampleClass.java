package interfacesample;

public class SampleClass implements Sample1{
	public void print()
	{
		System.out.println("haii");
	}
	public void display()
	{
		System.out.println("good morning");
		System.out.println(a+b);
	}
	public void disp()
	{
		System.out.println("Method of class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SampleClass obj=new SampleClass();
		Sample1 obj1=new SampleClass();
		obj1.print();
		obj1.display();
		//obj1.disp();

	}

}
