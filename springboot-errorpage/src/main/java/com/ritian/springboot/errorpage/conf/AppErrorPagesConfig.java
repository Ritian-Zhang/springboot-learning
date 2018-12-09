package com.ritian.springboot.errorpage.conf;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @author ritian.Zhang
 * @date 2018/12/07
 **/
@Component
public class AppErrorPagesConfig implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        // 400 bad request
        ErrorPage e400 =  new ErrorPage(HttpStatus.BAD_REQUEST,"/error/400");
        //错误类型为404，找不到网页
        ErrorPage e404 =  new ErrorPage(HttpStatus.NOT_FOUND,"/error/404");
        // 500 服务端错误
        ErrorPage e500 =  new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error/500");

        registry.addErrorPages(e400,e404,e500);
    }
}
