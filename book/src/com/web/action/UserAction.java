package com.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction implements Action{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8268636603346548910L;
	
	private String username;
	private String password;
	public void setUsername(String username){
		this.username = username;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public String execute(){
		if("scott".equals(username)&&"tiger".equals(password)){
			return SUCCESS;
		}else{
			System.out.println("error");
			return ERROR;
		}
	}
}
