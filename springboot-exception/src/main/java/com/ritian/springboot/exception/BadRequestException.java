package com.ritian.springboot.exception;

/**
 * @author ritian.Zhang
 * @date 2018/12/09
 **/
public class BadRequestException extends  Exception{


    private static final long serialVersionUID = 7910607419579477180L;

    public  BadRequestException(){

    }
    public BadRequestException(String message){
        super(message);
    }
}
