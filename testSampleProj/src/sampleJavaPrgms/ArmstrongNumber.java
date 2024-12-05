package sampleJavaPrgms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n = 371, temp = n;
		int sum = 0;
		int rem;

		while (n != 0) {
			rem = n % 10; // 153/10 - 3, 15/10 - 5 , 1/10 = 1
			n = n / 10; // 153/10 - 15.3 // 15/10 = 1.5
			sum = sum + (rem * rem * rem);
		}
		if (sum == temp) {
			System.out.println(temp + " is an armstrong number");
		} else {
			System.out.println(temp + " is not an armstrong number");
		}
	}

}

// 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 152 +1 = 153
// 3 * 3 * 3 + 7 * 7 * 7 + 1* 1* 1 = 27 + 343 + 1
