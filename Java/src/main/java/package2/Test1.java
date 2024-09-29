package package2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Test1 {

	public static void main(String[] args) {

		//String str = "My Name Is Mahan";

		String str1 = "My Naaame Is MMahan";


		//Out --> yM emaN sI nahM

		//yM emaN sI haham



		StringTokenizer tokens = new StringTokenizer(str1);

		while(tokens.hasMoreElements()) {

			String token = tokens.nextToken();	

			char[] c1 = token.toCharArray();

			List<Character> list = new ArrayList<Character>();

			for(int i=0; i<token.length()-1; i++) {

				if(c1[i]!=c1[i+1]) {
					list.add(c1[i]);
				}
			}

			if(c1[token.length()-1]!=c1[token.length()-2]) {
				list.add(c1[token.length()-1]);
			}


			Iterator<Character> itr = list.iterator();

			while(itr.hasNext()) {
				System.out.print(itr.next());
			}

			System.out.println();




		}




	}

}
