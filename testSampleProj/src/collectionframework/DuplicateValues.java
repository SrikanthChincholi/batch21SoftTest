package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValues {

	public static void main(String[] args) {

		String str[] = {"Srikanth", "Srikanth", "Srikanth", "Srikanth", "Chandu",
				"Lucky", "Aaryan", "Aaryan", "Chandu" };

		Map<String, Integer> map = new HashMap<>();

		for (String s : str) {
			if (!map.containsKey(s)) {
				map.put(s, 1); // Srikanth, 1
			} else {
				map.put(s, map.get(s) + 1); // Srikanth, 2
			}
		}

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " Repeated :  " + m.getValue() + " times");
		}

	}

}
