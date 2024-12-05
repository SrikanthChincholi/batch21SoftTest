package sampleJavaPrgms;

public class FactorialNumber {

	public static void main(String[] args) {

		int n = 5; // 5 * 4 * 3 * 2 * 1 = 120
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i; // 1 * 1 = 1 // 1 * 2 = 2 // 2 * 3 = 6 // 6 * 4 = 24 // 24 * 5 = 120
		}
		System.out.println(" Factorail of " + n + " is " + fact);

	}

}
