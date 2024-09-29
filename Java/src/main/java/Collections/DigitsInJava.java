package Collections;

import java.util.ArrayList;
import java.util.List;

public class DigitsInJava {
	
	public static void main(String[] args) {
		
		String str = "My23 N8ame6 i7s XyZ5";
		
		List<Character> numbers = new ArrayList<>();
		
		for(char c : str.toCharArray()) {
			
			if(Character.isDigit(c)) {
				numbers.add(c);
				
				Character.isWhitespace(c);
			}
		}
		
		for(int i=numbers.size()-1; i>=0; i--) {
			System.out.print(numbers.get(i));
		}
		
	}

}
