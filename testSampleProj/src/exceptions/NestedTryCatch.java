package exceptions;

public class NestedTryCatch {

	public static void main(String[] args) {

		try {
			System.out.println(100 / 0);
			try {
				String n = null;
				System.out.println(n.charAt(0));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
			
		}
	}

}
