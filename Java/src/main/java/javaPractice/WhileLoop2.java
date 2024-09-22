package javaPractice;

public class WhileLoop2 {
	
	public static void main(String[] args) {
		
		int k = 10;
		
		while(k>1) {
			System.out.println(k);
			
			if(k==3) {
				continue;
			}
			
			k--;
		}
		
	}

}
