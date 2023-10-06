package polymorphism;

public class Child extends Parent {
	@Override
	public void display()
	{
		//super.display();
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		Parent obj1=new Parent();
		obj1.display();
		obj.display();
		
	}

}
