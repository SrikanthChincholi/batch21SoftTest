package strings;

import java.util.Arrays;

public class ReplaceCharsWithCount {

	public static void main(String[] args) {
		String name = "Java Beta Geta Data Yata";
		int count = 1;
		for (int i = 0; i < name.toCharArray().length; i++) {
			name = name.replaceFirst("a", String.valueOf(count));
			count++;
		}

		System.out.println(name);
	}
}

class SortString {
	public static void main(String[] args) {
		String str[] = { "USA","USA","USA","USA", "NZL", "UK", "GER", "IND", "CHINA" };
		for (int i = 0; i < str.length; i++) {
			String temp = "";
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));

	}
}
