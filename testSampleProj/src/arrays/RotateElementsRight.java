package arrays;

import java.util.Arrays;

public class RotateElementsRight {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int temp;

		for (int i = 0; i < a.length-1; i++) {
			temp = a[i]; // 1
			a[i] = a[i + 1]; // 2
			a[i + 1] = temp;

		}
		System.out.println(Arrays.toString(a));
	}

}

