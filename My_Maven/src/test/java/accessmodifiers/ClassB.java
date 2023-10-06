package accessmodifiers;

public class ClassB {
	public static void print()
	{
		System.out.println("Class 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		ClassA.print();
		//System.out.println(ClassA.a);

	}

}
