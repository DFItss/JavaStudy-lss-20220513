package J23_예외처리;

public class ThrowEx {

	public static void main(String[] args) {

		try {
			System.out.println("프로그램 실행중");
//			throw new IndexOutOfBoundsException();
			int i = 0;
			if(i==0) {
				throw new VlidationCustomException("예외 발생");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("예외 발생여부와 무관하게 무조건 실행되는 부분");
		}
		
	}

}
