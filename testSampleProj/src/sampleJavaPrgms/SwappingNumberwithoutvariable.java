package sampleJavaPrgms;

public class SwappingNumberwithoutvariable {

	public static void main(String[] args) {

		int a = 1341;
		int b = 2452;

		System.out.println(" Before swapping a is " + a);
		System.out.println(" Before swapping b is " + b);

		a = a + b; // 70
		b = a - b; // 70 - 40 = 30
		a = a - b; // 70 - 30 = 40
		
		System.out.println(" After swapping a is " + a);
		System.out.println(" After swapping b is " + b);

	}
}

// b = 30
// a = 40