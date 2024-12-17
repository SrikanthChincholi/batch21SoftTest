package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListofMaps {

	static List<Map<String, String>> lmap;

	public static void main(String[] args) {

		Map<String, String> m = new HashMap<>();
		Map<String, String> m1 = new HashMap<>();
		lmap = new ArrayList<>();
		m.put("21", "Srikanth");
		m.put("11", "Chandu");
		m.put("41", "Aaryan");
		m.put("31", "Srikanth1");
		m.put("61", "Chandu2");
		m.put("01", "Aaryan3");
		lmap.add(m);
		m1.put("211", "Srikanth");
		m1.put("111", "Chandu");
		lmap.add(m1);
		for (Map<String,String> lm : lmap) {
			for (Map.Entry<String, String> mm : lm.entrySet()) {
				System.out.println(mm.getValue());
			}
		}

	}

}
