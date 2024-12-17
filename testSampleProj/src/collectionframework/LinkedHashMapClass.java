package collectionframework;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapClass {

	public static void main(String[] args) {

		Map<String, String> m = new LinkedHashMap();
		m.put("21", "Srikanth");
		m.put("11", "Chandu");
		m.put("41", "Aaryan");
		m.put("31", "Srikanth1");
		m.put("61", "Chandu2");
		m.put("01", "Aaryan3");

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
