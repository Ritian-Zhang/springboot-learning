package com.ritian.springboot.util;

/**
 * 异常响应信息，最后会转换成json字符串
 * @author ritian.Zhang
 * @date 2018/12/09
 */
public class ExceptionResponse {

	private Integer code;
	private String message;

	public ExceptionResponse(Integer code, String message) {
		this.message = message;
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
