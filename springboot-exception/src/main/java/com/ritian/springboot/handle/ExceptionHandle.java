package com.ritian.springboot.handle;

import com.ritian.springboot.exception.NotFoundException;
import com.ritian.springboot.util.ExceptionResponse;
import com.ritian.springboot.util.ExceptionResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * 统一异常处理类<br>
 * 捕获程序所有异常，针对不同异常，采取不同的处理方式
 * @author ritian.Zhang
 * @date 2018/12/09
 **/
@ControllerAdvice
@ResponseBody
public class ExceptionHandle {

    /**
     * <strong>@ExceptionHandler</strong>指定需要捕获的异常类型<br>
     * 捕获抛出的所有SQLException异常
     * @param request
     * @param ex
     * @return
     */
    @ExceptionHandler(SQLException.class)
    public ExceptionResponse handleSqlException(HttpServletRequest request, Exception ex){
        return ExceptionResponseUtil.init(100001, "SQL异常！");
    }

    /**
     * <strong>@ExceptionHandler</strong>指定需要捕获的异常类型<br>
     * <strong>@ResponseStatus</strong>指定Http响应状态码：404<br>
     * 捕获抛出的所有NotFoundException异常
     * @param ex
     * @return
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ExceptionResponse handleNotFoundException(NotFoundException ex) {
        ex.printStackTrace();
        return ExceptionResponseUtil.init(HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }

    /**
     *
     * @param request
     * @param ex
     * @return
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ExceptionResponse handleServerErrorException(HttpServletRequest request,Exception ex){
        String message =  ex.getMessage();
        ex.printStackTrace();
        return ExceptionResponseUtil.init(HttpStatus.INTERNAL_SERVER_ERROR.value(),message);
    }

}
