package strings;

public class ReplaceCharInAStringwithNumber {

	public static void main(String[] args) {

		String name = "Java Tata Beta Meta";
		String res = "";
		int count = 1;
		for (int i = 0; i < name.toCharArray().length; i++) {
			if (name.charAt(i) == 'a') {
				res = res + count;
				count++;
			} else {
				res = res + name.charAt(i);
			}
		}
		System.out.println(res);
	}

}
