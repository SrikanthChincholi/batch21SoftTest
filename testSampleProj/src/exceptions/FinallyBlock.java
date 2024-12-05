package exceptions;

public class FinallyBlock {
	public static void main(String[] args) {

		try {
			System.out.println(100);
			System.out.println(11);
			System.out.println(12);
			System.out.println(13);

		} catch (Exception e2) {
			e2.printStackTrace();

		} finally {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
		}
	}
}
