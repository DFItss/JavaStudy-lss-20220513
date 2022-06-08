package J23_예외처리;

import java.lang.reflect.Array;

public class Throws01 {

	public void printArray(int[] arrays) throws Exception {
//		매소드를 호출하는곳에 예회처리를 미루겠다는 의미, 예외가 발생할지도 모른다는 뜻을 담고있음.
		for(int i=0; i<arrays.length; i++) {
			System.out.println("index" + " : " + arrays[i]);
		}
		
	}
}
