package accessmodifier1;

import accessmodifiers.ClassA;
import accessmodifiers.ClassB;

public class ClassC extends ClassA{

	public static void print()
	{
		System.out.println("class 3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		ClassA.print();
		ClassB.print();
		//System.out.println(ClassA.a);
		
		//System.out.println(ClassA.b);
		//System.out.println(ClassA.c);

	}

}
