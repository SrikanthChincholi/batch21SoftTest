package exceptions;

public class ExceptionsSequence {

	public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {

		try {
			int arr[] = new int[1];
			//arr[8] = 10;
			//System.out.println(100 / 0);
			String str = null;
			//str.toCharArray();
			String s[] = null;
			for(int i = 0;i<s.length;i++)
				System.out.println(s[9]);
			
		} catch (Exception e3) {
			e3.printStackTrace();
		}

	}

}
