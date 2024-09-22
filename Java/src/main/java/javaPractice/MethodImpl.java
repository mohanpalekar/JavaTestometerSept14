package javaPractice;

public class MethodImpl {

	public static void main(String[] args) {

		Method2 method = new Method2();

		//		method.sumOf2Numbers(43, 67);
		//		
		//		method.sumOf2Numbers(12, 24);
		//		
		//		int d = method.sumOf2Number(12, 34);
		//		
		//		d = d+3;
		//		
		//		System.out.println(d);
		//		
		//		int ar [] = method.getTable(1);
		//		
		//		Q1.getPairsOf7(ar);
		//		
		//		method.writeTable(3);

		method.checkIfPresent("Hello there", "Hello");
		
		method.checkIfPresent("Hello there get", "Get");
		
		String str = "My Name is ZYX";
		
		System.out.println(str.toLowerCase());
		
		String updatedStrig = method.convertStringToLowercase(str);
		
		updatedStrig = method.convertStringToUpperCase(updatedStrig);
		
		System.out.println(updatedStrig);

	}

}
