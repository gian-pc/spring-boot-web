package com.gianpc.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/requestParam")
public class RequestParamController {

    //localhost:8080/requestParam/string

    @GetMapping("/string")
    public String param(@RequestParam(required=false) String texto, Model model) {
        model.addAttribute("texto", texto);
        return "requestParam/ver";
    }

    @GetMapping("/varios-tipos")
    public String param(@RequestParam(defaultValue = "No se encontró valor") String texto,@RequestParam(defaultValue = "0") Integer numero, Model model) {
        model.addAttribute("texto", texto);
        model.addAttribute("numero", numero);
        return "requestParam/ver";
    }

}
