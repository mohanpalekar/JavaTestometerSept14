package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetInJava {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

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

		set.add(null);
		set.add(null);

		//System.out.println(set);

		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		set1.add("Guava");
		set1.add("Apple");
		set1.add("Pineapple");
		
		set2.add("Guava");
		set2.add("Mango");
		set2.add("Pomegrenate");
		
		set1.removeAll(set2);
		
		System.out.println(set1);


	}

}
