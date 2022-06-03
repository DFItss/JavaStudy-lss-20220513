package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {

		ArrayList<String> nameList   = new ArrayList<String>();
		ArrayList<String> nameList02 = new ArrayList<String>();
//		리스트에 값 추가 > add()
		nameList.add("aaa");
		nameList.add("bbb");
		nameList.add("ccc");
		nameList.add("ddd");
		nameList.add("eee");
		nameList.add("fff");
		nameList.add("ggg");
		
//		리스트 중간에 값 삽입 > add()
		nameList.add(0, "kkk");
		
//		리스트 내의 해당 인덱스 값 수정
		nameList.set(1, "lll");
		
//		리스트 내에서 인덱스로 값 삭제
		nameList.remove(3);
		
		
//		리스트에서 리스트로 값 옮기기(깊은 복사)
		nameList02.addAll(nameList);
		
		
		
//		리스트 내의 모든 값 확인 > toString() : 생력되어있음.
		System.out.println(nameList);
		
//		리스트에서 값 가져오기 > get(인덱스 번호)
		System.out.println(nameList.get(3));
		
//		리스트 내에서 원하는 값이 있는지 확인
		System.out.println(nameList.contains("aaa"));
		System.out.println(nameList.contains("bbb"));
		
//		리스트 내에 값이 하나라도 있으면 비우기
		if(!nameList.isEmpty()) {
			nameList.clear();
		}
		
		System.out.println(nameList);
		System.out.println(nameList02);
		
//		리스트를 배열로 변환
		Object[] objs = nameList02.toArray();
		for(Object obj : objs) {
			System.out.println((String) obj);	//다운캐스팅 후 출력
		}
	}

}
