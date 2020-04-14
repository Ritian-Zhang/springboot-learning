package com.ritian.webflux.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author ritian
 * @since 2020/4/14 18:01
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    public Mono<User> test() {
        return Mono.just(new User("jack", 16));
    }


    @AllArgsConstructor
    @Data
    static class User {
        private String name;
        private Integer age;
    }
}
