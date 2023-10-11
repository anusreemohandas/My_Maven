package multipleinheritance;

public class Child implements ParentA,ParentB {
	public void print()
	{
		System.out.println("Parent A");
	}
	public void display()
	{
		System.out.println("Parent B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child obj=new Child();
		ParentA obj=new Child();
		obj.print();
		//obj.display();

	}

}
