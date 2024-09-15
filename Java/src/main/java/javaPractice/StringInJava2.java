package javaPractice;

public class StringInJava2 {
	
	public static void main(String [] args) {
		
		StringBuilder sb = new StringBuilder();
		
		String str = "Hey there!";
		
		sb.append(str);
		
		//System.out.println(sb.reverse());
		
		//System.out.println(sb.toString());
		
		System.out.println(sb.replace(0, 4, "TSG"));
		
		System.out.println(sb.length());
		
		
		
	}

}
