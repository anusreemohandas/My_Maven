package polymorphism;

public class FinalChild extends FinalParent{
	//@Override
	final int c=7;
	public void add()
	{
		int a=4;
		int b=2;
		System.out.println(a+b);
		//c=8; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalChild obj=new FinalChild();
		obj.add();

	}

}
