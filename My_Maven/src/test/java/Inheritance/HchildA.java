package Inheritance;

public class HchildA extends Hparent {
	public void add()
	{
		System.out.println("First child :"+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HchildA obj=new HchildA();
		obj.add();
		obj.print();
	}

}
