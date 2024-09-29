package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetInJava {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new LinkedHashSet<>();
		
		set.add(12);
		set.add(43);
		set.add(11);
		set.add(9);
		set.add(45);
		set.add(49);
		set.add(11);
		set.add(null);
		set.add(null);
		set.add(11);
		
		System.out.println(set);
		
		
	}

}
