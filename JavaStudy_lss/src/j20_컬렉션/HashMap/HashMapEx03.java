package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import j20_컬렉션.entity.Student;

public class HashMapEx03 {

	public static void main(String[] args) {

		HashMap<Integer, Student> students = new HashMap<Integer, Student>();
		
		students.put(20220001, new Student(20220001, "aaa", "a대학교"));
		students.put(20220002, new Student(20220002, "bbb", "b대학교"));
		students.put(20220003, new Student(20220003, "ccc", "c대학교"));
		students.put(20220004, new Student(20220004, "ddd", "d대학교"));
		students.put(20220005, new Student(20220005, "eee", "e대학교"));
		
/*
 * 		문제>
 * 
 * 		1. 이름이 "ddd"인 학생의 대학을 f대학으로 변경하여라.
 * 		2. 20220003 학번 학생을 20220003, "ggg", "g대학교"로 변경
 * 		3. 20220005 학번 학생을 삭제
 * 		4. 20220002 학번 학생정보 출력
 * 
 */
		
//		1. 이름이 "ddd"인 학생의 대학을 f대학으로 변경하여라.
		Iterator<Integer> iterator = students.keySet().iterator();
		
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			Student student = students.get(key);
			if(student.getName().equals("ddd")) {
				student.setSchoolName("f대학교");
				break;
			}
		}
		
		for(Student student : students.values()) {
			if(student.getName().equals("ddd")){
				student.setSchoolName("f대학교");
			}
		}
		
		students.forEach((k, v) -> {
			if(v.getName().equals("ddd")) {
				v.setSchoolName("f대학교");
			}
		});
		
//		2. 20220003 학번 학생을 20220003, "ggg", "g대학교"로 변경
		students.replace(20220003, new Student(20220003, "ggg", "g대학교"));
		System.out.println("2번 수정 확인 : " + students.get(20220003));
//		3. 20220005 학번 학생을 삭제
		students.remove(20220005);
		System.out.println("3번 삭제 확인 : " + students.get(20220005));
//		4. 20220002 학번 학생정보 출력
		System.out.println("5번 정보 출력 : " + students.get(20220002));
	}

}
