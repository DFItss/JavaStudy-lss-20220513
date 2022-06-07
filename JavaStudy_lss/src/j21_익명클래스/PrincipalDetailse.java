package j21_익명클래스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrincipalDetailse {

	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");

//		재사용 하지 않고 내용을 다르게 사용하고자 할때??
		GrantedAuthority grantedAuthority01 = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				System.out.println(roles);
				return null;
				
			}
		};
		
		GrantedAuthority grantedAuthority03 = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {

				return null;
				
			}
		};
//		인터페이스를 상속받은 클래스를 생성하는 방법. 재사용 가능.
		GrantedAuthority grantedAuthority02 = new GrantedAuthorityImpl();
		
		grantedAuthority01.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority02.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority03.getRoles(strList).forEach(r -> {System.out.println(r);});
		
	}

}
