package collectionframework;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClass {

	public static void main(String[] args) {

		Map<String, String> m = new HashMap<>();
		m.put("11", "Srikanth");
		m.put("21", "Chandu");
		m.put("31", "Aaryan");

		System.out.println(m);

		Set s = m.keySet();
		for (Object ss : s) {
			System.out.println("Key :" + ss + " Value : " + m.get(ss));
		}

		for (Entry<String, String> map : m.entrySet()) {
			System.out.println("Key -- > " + map.getKey() + " " + "Value --> " + map.getValue());
		}

	}

}
