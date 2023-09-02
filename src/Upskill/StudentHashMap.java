package Upskill;

import java.util.Collections;
import java.util.HashMap;

public class StudentHashMap {
	
	public static void main (String[] args) {
		
		HashMap<String, String>map = new HashMap<>();
		map.put("Anish", "A");
		map.put("Srikanth", "C");
		map.put("Chandru", "B");
		map.put("Yogesh", "D");
		
		System.out.println("HashMap of Students with Grade: ");
		System.out.println(map);
		
		String lowestGrade = Collections.max(map.values());
		map.values().remove(lowestGrade);
		
		System.out.println("After removing the lowest grade Date:");
		System.out.println(map);
	}

}
