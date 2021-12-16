package kr.co.jsp.user.model;

/*
 CREATE TABLE my_user(
    user_id VARCHAR2(30) PRIMARY KEY,
    user_pw VARCHAR2(30) NOT NULL,
    user_name VARCHAR2(20) NOT NULL,
    user_email VARCHAR2(100),
    user_address VARCHAR2(100)
);
 */

public class UserVO {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;
	
	public UserVO() {}

	public UserVO(String id, String pw, String name, String email, String address) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}




















