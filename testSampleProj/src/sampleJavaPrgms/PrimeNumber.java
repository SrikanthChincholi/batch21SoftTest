package sampleJavaPrgms;

public class PrimeNumber {

	public static void main(String[] args) {

		for (int j = 2; j <= 100; j++) {
			int flag = 1;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					flag++; // 3
				}
			}
			if (flag > 1) {
			//	System.out.println(j + " is not a prime");
			} else {
				System.out.println(j + " is a prime ");
			}

		}
	}
}

// its divisible by 1 and itself

// 