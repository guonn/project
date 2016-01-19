package test;

import java.util.date;

public class Util{
	public static String SUCCESS="success";
	private String username;
	private String password;

	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String execute(){
		return SUCCESS;
	}
}
