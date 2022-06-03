package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
//		set : 순서가 없고 값의 중복을 허용하지 않는다.
		HashSet<String> name = new HashSet<String>();
		
		name.add("aaa");
		name.add("bbb");
		name.add("ccc");
		name.add("ddd");
		name.add("aaa");
		name.add("aaa");
		name.add("aaa");

		System.out.println(name);
		
		Iterator<String> iterator = name.iterator();
		
		while(iterator.hasNext()) {
			String name02 = iterator.next();
			if(name02.equals("bbb")) {
				System.out.println(name02);
			}
		}
		
		name.remove("bbb");
		System.out.println(name);
	}

}
