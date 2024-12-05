package arrays;

public class DuplicateElements {

	public static void main(String[] args) {

		int a[] = { 10,19,23,23,45,56,7,8,23,45,56,7,8};
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = '&';
				}
			}
			if (count > 0 && a[i]!= '&') {
				System.out.println(a[i] + "Repeated :" + count);
			}

		}

	}

}
