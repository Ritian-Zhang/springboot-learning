package com.ritian.springboot.util;

/**
 * 异常响应信息工具类
 * @author ritian.Zhang
 * @date 2018/12/09
 */
public class ExceptionResponseUtil {
	public static ExceptionResponse init(Integer code, String message) {
		return new ExceptionResponse(code, message);
	}

}
