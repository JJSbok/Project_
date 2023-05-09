package com.codingrecipe.member.controller;

import com.codingrecipe.member.dto.MemberDTO;
import com.codingrecipe.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor

public class MemberController {
    private final MemberService memberService;
//    @GetMapping("/member/save") //이렇게 사용하거나 save만 작성할경우 requestMapping을 사용하여 아래처럼 사용가능
    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO){

int saveResult = memberService.save(memberDTO);
if (saveResult> 0){
    return "login";
}else{
    return "save";
}
    }


    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute MemberDTO memberDTO,
                        HttpSession session){
        boolean loginResult = memberService.login(memberDTO);
        if(loginResult){
            session.setAttribute("loginEmail", memberDTO.getMemberEmail());
            return "main";
        }else{
            return "login";

        }
    }
}
