package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String s=excelcode.readStringData(0, 0);
		System.out.println(s);
		double d=excelcode.readIntegerData(0, 1);
		System.out.println(d);

	}

}
