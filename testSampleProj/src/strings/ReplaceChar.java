package strings;

public class ReplaceChar {
	public static void main(String[] args) {

		String name = "Java Tata Beta Meta";
		int count = 1;
		for (int i = 0; i < name.toCharArray().length; i++) {
			name = name.replaceFirst("a", String.valueOf(count));
			count++;
		}
		System.out.println(name);
	}
}
