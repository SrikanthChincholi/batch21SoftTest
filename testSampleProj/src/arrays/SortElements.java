package arrays;

public class SortElements {

	public static void main(String[] args) {

		int a[] = { 60, 50, 40, 30, 20, 10 };
		int temp;

		for (int i = 0; i < a.length; i++) // a[0] = 60
		{
			temp = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) { // 60 > 50
					temp = a[i]; // temp = 60;
					a[i] = a[j]; // 50;
					a[j] = temp; // 60
				}
			}
		}
		for (int value : a) {
			System.out.println(value);
		}
	}

}
