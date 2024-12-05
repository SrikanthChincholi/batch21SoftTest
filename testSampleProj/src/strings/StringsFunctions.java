package strings;

import java.util.Arrays;

public class StringsFunctions {

	public static void main(String[] args) {

		String str = "Srikanth Chincholi";
		System.out.println(str.contains("Chin"));
		String str1 = "Hyderabad";
		String str2 = "Hyderabad";
		String s = new String("HYDERABADHYDERABAD");
		int value = 10;
		System.out.println(str1.concat(str));
		System.out.println(str1 + str + value);
		boolean check = str1.contentEquals(s);
		System.out.println(check);
		System.out.println(str1.endsWith("rabad"));
		System.out.println(str1.startsWith("Hyder"));
		System.out.println(str1.equals(s));
		System.out.println(str1.equalsIgnoreCase(s));
		System.out.println(s.indexOf('A'));
		System.out.println(s.indexOf('A', 16));
		System.out.println(s.indexOf('A', 6));
		System.out.println(s.lastIndexOf('A'));
		System.out.println(s.lastIndexOf("HYD"));
		String a = " ";
		System.out.println(a.isBlank());
		System.out.println(a.isEmpty());
		System.out.println(s.length());
		// System.out.println(s.replace('A', 'a'));
		// System.out.println(s.replace("HYD", "hyd"));
		System.out.println(s.replaceFirst("HYD", "hyd"));
		System.out.println(s.substring(9, 16));
		System.out.println(s.toLowerCase());
		s = "hyderabad   hyderabad";
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		String s1 = "hyder%abad%hyder%abad";
		System.out.println(s.compareTo(s1));
		String ss = " h  y $%4 ^ 6&* 8*  d e   r a b   ad   hy d e r a  b         a d         ";
		char ch[] = ss.toCharArray();
		String res = "";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!= ' ' && Character.isAlphabetic(ch[i]))
			{
				res = res + ch[i];
			}
		}
		System.out.println(res);
		String sarr[] = s1.split("%");
		System.out.println(Arrays.toString(sarr));
		
		}

}
