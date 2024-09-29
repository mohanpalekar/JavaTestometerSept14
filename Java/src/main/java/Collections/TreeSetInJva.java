package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetInJva {
	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		

		set.add("Guava");
		set.add("Apple");
		set.add("Pineapple");
		set.add("Guava1");
		set.add("Apple1");
		set.add("Pineapple1");
		set.add("Guava2");
		set.add("Apple2");
		set.add("Pineapple2");
		set.add("Pineapple2");
		set.add("Pineapple2");

		
		System.out.println(set);
		
	}

}
