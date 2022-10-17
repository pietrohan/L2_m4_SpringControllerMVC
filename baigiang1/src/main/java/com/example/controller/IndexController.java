package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping("/")
    public String get(Model model){
        model.addAttribute("message", "home");
        return "/home";
    }
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("massege", "index");
        return "/index";

    }
}
