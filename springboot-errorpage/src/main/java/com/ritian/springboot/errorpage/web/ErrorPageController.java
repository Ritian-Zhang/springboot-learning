package com.ritian.springboot.errorpage.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ritian.zhang
 * @date 2018/12/07
 */
@Controller
@RequestMapping("/error")
public class ErrorPageController{

    /**
     * 404错误页面 not found
     */
    @GetMapping(value = "/404")
    public String error404(Model model){
        return "error/404";
    }

    /**
     * 400 错误页面 bad request
     * @return
     */
    @GetMapping(value = "/400")
    public String error400( Model model){
        return "error/400";
    }

    /**
     * 500 错误页面 INTERNAL_SERVER_ERROR
     * @return
     */
    @GetMapping(value = "/500")
    public String error500(Model model){
        return "error/500";
    }

}
