package sampleJavaPrgms;

public class FabinocciSeries {
	public static void main(String[] args) {
		int f0 = 0, f1 = 1, f2;
		for (int i = 0; i <= 10; i++) {
			f2 = f0 + f1; // 0 1 = 1 1 + 1 = 2 1 +2 = 3
			f0 = f1; // 1
			f1 = f2; // 1 // 2
			// 1 //
			System.out.println(f2);
		}
	}

}

// 0 1 1 2 3 5 8 13