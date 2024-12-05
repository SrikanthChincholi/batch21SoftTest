package arrays;

public class SecondMaxElement {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int max = a[0], secmax = a[0];

		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {
				secmax = max; // 1
				max = a[i];// 2
			} else if (secmax != max && secmax < a[i]) {
				secmax = a[i];
			}
		}

		System.out.println(max + " Maximum ");
		System.out.println(secmax + " Second Maximum");
	}

}
