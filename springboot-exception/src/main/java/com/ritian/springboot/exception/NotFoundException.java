package com.ritian.springboot.exception;

/**
 * @author ritian.Zhang
 * @date 2018/12/09
 **/
public class NotFoundException extends Exception {

    private static final long serialVersionUID = 2597274773734613020L;

    public NotFoundException() {

    }

    public NotFoundException(String message) {
        super(message);
    }

}
