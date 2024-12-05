package testSampleProj;

import java.io.File;

public class TestClass {
	
	static int value = 10;
	
	static
	{
		System.out.println("Static block :"+ value);
	}

	public static void main(String[] args) throws Exception {
		TestClass tc = new TestClass();
		tc.test();
		
	}
	
	public void test() throws Exception
	{
		int a = 23;
		short b = 12;
		b = (short) (a / b);
		System.out.println("Test Message !!" + b);

		File file = new File("Test.xlsx");
		if (file.exists()) {
			System.out.println("File exisits");
		} else {
			throw new Exception("No File found !!");
		}
	}
	}


