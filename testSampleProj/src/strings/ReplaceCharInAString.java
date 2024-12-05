package strings;

public class ReplaceCharInAString {

	public static void main(String[] args) {

		String name = "Java Tata Beta Meta";
		String res = "";
		for (int i = 0; i < name.toCharArray().length; i++) {
			if (name.charAt(i) == 'a') {
				res = res + '$';
			} else {
				res = res + name.charAt(i);
			}
		}
		System.out.println(res);
	}

}
