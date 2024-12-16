package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericClass {
	
	public static void main(String[] args) {
		
		//listMeth();
		setMeth();
	}
	
	public static void listMeth()
	{
		List<String> li = new ArrayList<>();
		li.add("Srikanth");
		li.add("Chandu");
		li.add("Aaryan");
		System.out.println(li);
		
	}
	
	public static void setMeth()
	{
		Set<String> li = new HashSet<>();
		li.add("Srikanth");
		li.add("Chandu");
		li.add("Aaryan");
		li.add(null);
		
		
		System.out.println(li);
		
	}

}
