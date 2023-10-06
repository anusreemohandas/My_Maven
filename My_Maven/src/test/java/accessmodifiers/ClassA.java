package accessmodifiers;

public class ClassA {
	public static void print()
	{
		System.out.println("Access modifier public");
		
	}

	private static int a=6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA.print();
		System.out.println(a);

	}

}
