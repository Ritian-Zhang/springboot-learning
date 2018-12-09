package com.ritian.springboot.exception;

/**
 * @author ritian.Zhang
 * @date 2018/12/09
 **/
public class RitianException extends Exception{
    private static final long serialVersionUID = 6355940153923772758L;

    private Integer code;

    public RitianException(){
        super();
    }
    public RitianException(String message){
        super(message);
    }

    public RitianException(Integer code, String message){
        super(message);
        this.code = code;

    }

    public Integer getCode() {
        return code;
    }

}
