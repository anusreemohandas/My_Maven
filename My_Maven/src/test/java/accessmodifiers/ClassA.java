package accessmodifiers;

public class ClassA {
	int d=9;
	public static void print()
	{
		System.out.println("Access modifier public");
		
	}

	private static int a=6;
	protected static int b=3;
	static int c=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA.print();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
