package strings;

public class StringMerge {

	public static void main(String[] args) {

		String s = "abcdwewessd";
		String s1 = "defefg";
		String res = "";
		int i = 0;
		int j = 0;

		while (i < s.length() && j < s1.length()) {
			res = res + s.charAt(i) + s1.charAt(j);
			i++;
			j++;
		}

		while (i < s.length()) {
			res = res + s.charAt(i);
			i++;

		}

		while (j < s1.length()) {
			res = res + s1.charAt(j);
			j++;
		}

		System.out.println(res);

	}

}

// abc def
// adbecf