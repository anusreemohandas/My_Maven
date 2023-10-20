package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String s=ExcelCode.readStringData(3,1);
		System.out.println(s);
		double d=ExcelCode.readIntData(3,0);
		System.out.println(d);

	}

}
