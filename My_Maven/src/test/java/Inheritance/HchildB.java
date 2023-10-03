package Inheritance;

public class HchildB extends Hparent {

	public void sub()
	{
		System.out.println("Second child :"+(a-b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HchildB obj=new HchildB();
		obj.sub();
		obj.print();

	}

}
