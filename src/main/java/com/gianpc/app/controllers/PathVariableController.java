package com.gianpc.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pathVariable")
public class PathVariableController {
    @GetMapping("/string/{texto}")
    public String variable(@PathVariable String texto, Model model) {
        model.addAttribute("texto", texto);
        return "pathVariable/ver";
    }

    // http://localhost:8080/pathVariable/varios-tipos/hola/20
    @GetMapping("/varios-tipos/{texto}/{numero}")
    public String variables(@PathVariable String texto,@PathVariable Integer numero, Model model) {
        model.addAttribute("texto", texto);
        model.addAttribute("numero", numero);
        return "pathVariable/ver";
    }
}
