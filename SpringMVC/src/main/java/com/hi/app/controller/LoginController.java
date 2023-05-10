package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
@Log4j2
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)//get 형식만 출력함
    public String loginForm(){
        log.info("/login ! get ");

        return "member/loginForm";
    }

    @RequestMapping(method = RequestMethod.POST)//post 형식만 출력함
public String login(){
        log.info("/login ! post ");
        // post 처리 후 redirect
        return "redirect:/sample/sample1";
        // http:localhost:8080/sample/sample1 절대경로
}
}
