package arrays;

public class ArraysEx2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int b : a) {
			if (b == 5)
				break;
			else
				System.out.println(b);
		}
	}

}
