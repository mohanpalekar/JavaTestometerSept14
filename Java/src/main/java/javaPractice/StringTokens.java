package javaPractice;

import java.util.StringTokenizer;

public class StringTokens {
	
	public static void main(String[] args) {
		 
		//String str = "My Name is XYz ";
		String str = "My;Name;is;XYz ";
		
		StringTokenizer tokens = new StringTokenizer(str, ";");
		
		System.out.println(tokens.countTokens());
		
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
	}

}
