package collectionframework;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();

		String str = "TATA META BETA DATA";
		char ch[] = str.toCharArray();
		for (Character c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (java.util.Map.Entry<Character, Integer> m : map.entrySet()) {
			if(m.getKey()!= ' ')
				System.out.println("Character : " + m.getKey() + " Repeated : " + m.getValue() + " times ");
		}
	}

}
