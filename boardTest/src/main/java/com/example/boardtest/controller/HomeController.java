package com.example.boardtest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 시작 주소를 받아주는 메소드를 가지고 있음
@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
