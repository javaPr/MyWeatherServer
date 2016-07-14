package com.baixing.myweather.bean;

public class LoginInfo {
	private String username;
	private int uid;
	private String session_id;
	private String session_cookie_name;
	private Privilege privilege;
	private int login;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getSession_id() {
		return session_id;
	}
	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}
	public String getSession_cookie_name() {
		return session_cookie_name;
	}
	public void setSession_cookie_name(String session_cookie_name) {
		this.session_cookie_name = session_cookie_name;
	}
	public Privilege getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	
	
	//{"username": "admin", "uid": 1, "session_id": "3cd24dba76aebdad0f30a72eab64498253724c54",
	//"session_cookie_name": "webpy_session_id", 
	//"privilege": {"admin": 1, "push": 1, "adboard": 1}, "login": 1}
}
