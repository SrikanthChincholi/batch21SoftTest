package arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		int a[] = new int[15]; // 0 - 9

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		a[6] = 70;
		a[7] = 70;
		a[8] = 70;
		a[9] = 70;
		a[10] = 80;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		int b[] = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}

	}

}
