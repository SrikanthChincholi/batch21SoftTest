package sampleJavaPrgms;

public class EvenOddNumbers {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the range for checking even or odd :"); int num =
		 * sc.nextInt();
		 */
		for (int i = 1; i < 100; i++)
			if (i % 2 == 0) {
				System.out.println(i + " Even Number ");
			} else {
				System.out.println(i + " Odd Number ");
			}
	}

}

// + , - , * , % ,/