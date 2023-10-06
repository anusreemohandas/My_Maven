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
		ClassA obj=new ClassA();
		System.out.println(obj.d);
		System.out.println(ClassA.b);
		System.out.println(ClassA.c);
	}

}
