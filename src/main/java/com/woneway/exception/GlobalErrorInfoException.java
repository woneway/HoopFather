package com.woneway.exception;

import com.woneway.domain.User;
import com.woneway.error.ErrorInfoInterface;

/**
 * 
 * GlobalErrorInfoException
 * Description: 统一错误码异常
 * author: woneway
 * 2018年4月9日
 */
public class GlobalErrorInfoException extends Exception {
	private ErrorInfoInterface errorInfo;
	
	public GlobalErrorInfoException(ErrorInfoInterface errorInfo) {
		this.errorInfo = errorInfo;
	}
	
	public ErrorInfoInterface getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfoInterface errorInfo) {
		this.errorInfo = errorInfo;
	}
}
