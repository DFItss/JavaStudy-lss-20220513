package j10_클래스기본정리.repository;

/*
 * Entity(독립체) Class
 * :정보를 담는 객체를 Entity 객체라고 한다. 
 */

public class User {

	private String userCode;
	private String email;
	private String name;
	private String userName;
	private String password;
	
//	1. 기본생성자
//	2. 전체생성자
//	3. getter
//	4. setter
//	5. toString(배우지않음)
	
//	<기본생성자>
	public User() {
//	생성자를 오버로딩했을때 기본생성자를 만들어놓지 않으면 기본생성자는 생략이 아닌 비활성화가된다.
	}
	
//	<전체생성자> Alt+Shift+S > Generate Constructor using Fields
	public User(String userCode, String email, String name, String userName, String password) {
//		super();
		this.userCode = userCode;
		this.email = email;
		this.name = name;
		this.userName = userName;
		this.password = password;
		
	}
	
//	<getter & setter>
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

//	toString(아직모름)
	@Override
	public String toString() {
		return "User [userCode=" + userCode + ", email=" + email + ", name=" + name + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
	
	
	
}
