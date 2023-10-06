package supersample;

public class SuperChild extends SuperParent {
	public void display() 
	{
		super.print();
		System.out.println("Super child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild obj=new SuperChild();
		obj.display();

	}
	
}