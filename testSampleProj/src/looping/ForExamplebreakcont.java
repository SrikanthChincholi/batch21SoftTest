package looping;

public class ForExamplebreakcont {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Value of i is : " + i);
			if (i == 5) {
				break;
			}
		}

		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("Value of i is : " + i);
		}
	}
}
