package supersample;

public class SuperChildVar extends SuperParentVar {
	int a=4;
	int b=4;
	public void add()
	{
		System.out.println("Child :"+(super.a+super.b));
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildVar obj=new SuperChildVar();
		obj.add();

	}

}
