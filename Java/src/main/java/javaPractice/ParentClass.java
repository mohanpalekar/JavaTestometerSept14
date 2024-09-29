package javaPractice;

public class ParentClass {

	public static void main(String[] args) {

		Student st = new Student(123, "8 B", new String []{"Math", "Science"}) ;

		System.out.println(st);

		System.out.println(st.getClassName());

		//System.out.println(st.getRollNo());

		System.out.println(st.getSubjects());

		st.setClassName("9 A");

		//st.setRollNo(456);

		st.setSubjects(new String[] {"Physics", "Geo"});

		System.out.println(st);

		Student st2 = new Student();

		//st2.setRollNo(789);

		System.out.println(st2);
		
		Student st3 = new Student(123);

	}

}
