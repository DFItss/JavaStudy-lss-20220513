package j09_접근지정자;

import j09_접근지정자.a.Student;
import j09_접근지정자.b.Teacher;

public class UserMain {

	public static void main(String[] args) {

		Student student = new Student();
		Teacher teacher = new Teacher();
		
		student.setName("eee");
		
		System.out.println(student.getName());
		
		teacher.setName("qqq");
		teacher.setAddress("qqq");
		teacher.setPhone("qqq");
		
		teacher.showInfo();
	}

}
