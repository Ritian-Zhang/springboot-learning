package com.ritian.springboot.config;

import com.ritian.springboot.interceptor.CustomInterceptor1;
import com.ritian.springboot.interceptor.CustomInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * spring boot 2.0版本后写法
 * @author ritian.Zhang
 * @date 2018/12/09
 **/
@Configuration
public class AppWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new CustomInterceptor1())
                .excludePathPatterns("/error1/**")
                .addPathPatterns("/random1/**");
        registry.addInterceptor(new CustomInterceptor2())
                .excludePathPatterns("/error1/**")
                .addPathPatterns("/random2/**");
    }
}
