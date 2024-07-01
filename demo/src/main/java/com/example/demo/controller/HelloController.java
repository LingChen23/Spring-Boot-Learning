package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //http://localhost:8080/hello
    //http://localhost/hello?nickname=zhangsan&phone=123
    @RequestMapping(value = "/hello", method = RequestMethod.GET)   //接收前端请求
    //@GetMapping(value = ("/hello"))
    public String hello(String nickname,String phone){
        return "你好 世界 你好 你好" + nickname +phone;
    }

}
