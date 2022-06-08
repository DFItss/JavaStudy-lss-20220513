package J23_예외처리;

public class VlidationCustomException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public VlidationCustomException() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("우리가 만든 예외");
	}
	
	public VlidationCustomException(String massege) {
		// TODO Auto-generated constructor stub
		super(massege);
		System.out.println("우리가 만든 예외 메세지 있음");
	}
	
	

}
