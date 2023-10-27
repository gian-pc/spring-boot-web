package com.gianpc.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping({"/index","/principal","/"})
    public String index(){
        return "index";
    }

    @GetMapping({"/home","/welcome","/casa"})
    public String home(){
        return "home";
    }
}
