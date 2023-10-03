package Inheritance;

public class NewChild extends NewParent{
	public void mul()
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewChild obj=new NewChild();
		obj.printg();
		obj.add();
		obj.mul();

	}

}
