package exceptions;

public class UncheckedExceptions {

	public static void main(String[] args) {

		System.out.println(100 / 0);

		int[] arr = new int[1];
		arr[0] = 1;
		arr[2] = 2;

		String str = null;
		System.out.println(str.toCharArray());

	}
}
