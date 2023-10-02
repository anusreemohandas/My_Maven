package Sample;

public class Average {
	public int findavg(int a,int b,int c)
	{
		int avg=(a+b+c)/3;
		return avg;
	}
	public float findavg(float a,float b,float c)
	{
		float avg=(a+b+c)/3;
		return avg;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average obj=new Average();
		System.out.println("Integer average: "+obj.findavg(2, 4, 6));
		System.out.println("Float average: "+obj.findavg(4.2f, 6.5f, 8.6f));
		

	}

}
