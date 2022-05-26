package j10_클래스기본정리.repository;

/*
 * Entity(독립체) Class 
 * 
 * 정보를 담는 객체를 Entity 객체라고 한다.
 * 
 */

public class User {
	private String usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	
	//기본생성자 - 클래스 기본기능
	//전체생성자
	//getter	 - 변수만을 위해서 존재
	//setter
	//toString
	
	//반환값이 안적혀있으면 기본이 default 이다. - 같은 패키지 안에서만 사용가능
	//기본생성자  //생성자 오버로딩되면 기본생성자 무조건 만들어준다.(전체생성자 있으면 주의)
	public User() {}

	//전체생성자  
	public User(String usercode, String email, String name, String username, String password) {
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	//getter & setter
	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//alt + shift + s - toString
	@Override
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	

	
	
}
