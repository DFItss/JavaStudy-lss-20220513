package j15_인터페이스;

public class Monitor implements Hdmi, VGA {
	
	@Override
	public void connect() {
		System.out.println("모니터 연결");
	}
	@Override
	public void disConnect() {
		System.out.println("모니터 연결 해제");
	}

}
