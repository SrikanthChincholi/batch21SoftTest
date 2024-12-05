package strings;

public class StringPrintCountofChars {

	public static void main(String[] args) {
		String str = "a2b3c4d5";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				int count = Character.getNumericValue(ch[i]);
				for (int j = 0; j < count; j++) {
					System.out.print(ch[i - 1]+ " ");
				}
			}
		}
	}

}

//a2b3c4d5

// a a b b b c c c c d d d d d