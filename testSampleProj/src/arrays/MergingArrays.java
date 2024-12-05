package arrays;

public class MergingArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = { 5, 6, 7, 8, 10, 19, 20, 12 };
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[j + a.length] = b[j];
		}

		for (int d : c) {
			System.out.print(d);
		}
	}

}
