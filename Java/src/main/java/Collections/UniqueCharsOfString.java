package Collections;

import java.util.Set;
import java.util.TreeSet;

public class UniqueCharsOfString {
	
	public static void main(String[] args) {
		
		String str  = "Myyyy Naaaammmme Is XyZ";
		
		Set<Character> set = new TreeSet<>();
		
		for(char c: str.toLowerCase().toCharArray()) {
			
			set.add(c);
			
		}
		
		System.out.println(set);
	}

}
