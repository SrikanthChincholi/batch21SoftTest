package strings;

public class SeparateChars {

	public static void main(String[] args) {

		String name = "Srikan@#@4453564643th253324%$^&$5";
		String num = "";
		String alphas = "";
		String splchars = "";
		char ch[] = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				alphas += ch[i];
			} else if (Character.isDigit(ch[i])) {
				num += ch[i];
			} else {
				splchars += ch[i];
			}
		}

		System.out.println("Alphabets : " + alphas);
		System.out.println("Numerics : " + num);
		System.out.println("Spl Chars : " + splchars);
	}

}
