package arrays;

public class MaxMin {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 5, 6, 7, 22 };
		int max = a[0], min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i]; // 30
			} else if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Maximum : " + max);
		System.out.println("Minimum : " + min);
	}

}
