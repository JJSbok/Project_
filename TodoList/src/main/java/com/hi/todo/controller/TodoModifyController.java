package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo/modify")
public class TodoModifyController {

    @RequestMapping(method= RequestMethod.GET)
    public String getModifyForm(Model model){
        log.info("get /todo/modify");
        model.addAttribute("todo", "TODO");
        return "todo/modifyForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String modify(){
        log.info("post /todo/modify");
        return "redirect:/todo/list";
    }
}
