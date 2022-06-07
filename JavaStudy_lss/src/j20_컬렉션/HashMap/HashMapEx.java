package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		
//		값 추가, 키 값이 다르면 내용은 중복이 가능.
		studentMap.put(20, "aaa");
		studentMap.put(10, "bbb");
		studentMap.put(22, "ccc");
		studentMap.put(33, "ddd");
		studentMap.put(44, "eee");
		System.out.println(studentMap);
//		key로 value 가져오기
		System.out.println(studentMap.get(33));
		
//		수정, put으로도 가능은 하지만 key값이 없을경우 추가한다.
		studentMap.put(10, "kkk");
		studentMap.replace(10, "zzz");
//		삭제
		studentMap.remove(10);
		
		Iterator<Integer> iterator = studentMap.keySet().iterator();
		
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
			if(value.equals("aaa")) {
				System.out.println(studentMap.get(key));
			}
		}
		
		
//		람다식(함수형 프로그래밍)
		studentMap.forEach((k, v) -> {
			System.out.println("key : " + k);
			System.out.println("value : " + v);
		});

		System.out.println(studentMap.containsKey(22));
		System.out.println(studentMap.containsValue("ppp"));
		
		 
		
		
	}

}
