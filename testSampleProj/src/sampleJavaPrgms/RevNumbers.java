package sampleJavaPrgms;

public class RevNumbers {

	public static void main(String[] args) {

		int num = 13334, n = 0; // 54321
		// 5
		int rev = 0;
		while (num != 0) { // 12345 , 1234 , 123, 12, 1 ,0
			n = num % 10; // 5//4//3//2//1
			rev = (rev * 10) + n; // 5 //4 //3 //2 //1 // 54321
			num = num / 10; // 1234.5 // 123.4 // 12.3 //1.2 // 1 // 0
			// 5 //54 //543 //5432// 54321
		}
		System.out.println(rev);

	}

}
