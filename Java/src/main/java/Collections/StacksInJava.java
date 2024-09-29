package Collections;

import java.util.Stack;

public class StacksInJava {

	public static void main(String[] args) {

		Stack<Float> stack = new Stack<>();

		stack.push(12.54f);
		stack.push(13.54f);
		stack.push(14.54f);
		stack.push(15.54f);


		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		//		
		//		System.out.println(stack);

		//		System.out.println(stack.pop());
		//		
		//		System.out.println(stack);

	}

}
