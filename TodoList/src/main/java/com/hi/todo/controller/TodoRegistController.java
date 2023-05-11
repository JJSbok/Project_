package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo/regist")
public class TodoRegistController {

    //get : form 페이지로 응답

    // post :  redirect >> /todo/list , view가 필요없

    @RequestMapping(method=RequestMethod.GET)
    public String getRegistFomr(){
//        WEB-IMF/views/todo/regsitForm.jsp
        log.info("GET /todo/regist");
        return "/WEB-INF/views/todo/registForm.jsp";
        // /WEB-INF/views/todo/registForm.jsp

    }
@RequestMapping(method = RequestMethod.POST)
    public String regist(){
        log.info("post /todo/regist");
        return "redirect:/todo/list";
        // 일반 view와 구분은 redirect: 문자열로 구분
        // http://localhost:8080/todo/list
}

    //post : redirect >> /todo/list, view 필요가 없다.

}
