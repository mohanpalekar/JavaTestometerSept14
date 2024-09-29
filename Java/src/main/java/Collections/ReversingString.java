package Collections;

import java.util.Stack;

public class ReversingString {

	public static void main(String[] args) {

		String str  = "My Name Is XyZ";

		char [] reverse = new char[str.length()];

		Stack<Character> stack = new Stack<>();

		for(char c : str.toCharArray()) {

			stack.add(c);

		}

		int i =0;

		//System.out.println(stack);

		while(!stack.isEmpty()) {

			reverse[i] = stack.pop();
			i++;
		}
		
		System.out.println(reverse);

	}

}
