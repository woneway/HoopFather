package com.woneway.error.user;

import com.woneway.error.ErrorInfoInterface;

public enum userErrorInfoEnum implements ErrorInfoInterface{
	USERNAME_NO_COMPLETE("400","未输入用户名"),
	USEREMAIL_NO_COMPLETE("400","未输入邮箱账号"),
	USERPWD_NO_COMPLETE("400","未输入密码"),
	INVALID_GRANT("400","用户名或者密码输入错误"),
	USER_NO＿VALIDATE("400","请前往邮箱激活账号"),
	USERPWD_NO_SAME("400","密码不一致");
	userErrorInfoEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private String code;
    
	private String message;

	
	
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
