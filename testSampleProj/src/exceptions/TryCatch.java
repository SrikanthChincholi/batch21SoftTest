package exceptions;

public class TryCatch {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(100 / 0);
		} catch (Exception e) {
			System.out.println(5);
			System.out.println(6);
			System.out.println(7);
		}
		try {
			System.out.println(15);
			System.out.println(26);
			System.out.println(37);
			String str =null;
			str.toCharArray();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(5);
			System.out.println(6);
			System.out.println(7);
		}
	}

}
