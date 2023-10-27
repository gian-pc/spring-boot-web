package com.gianpc.app.controllers;

import com.gianpc.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/index","/",""})
    public String index(Model model){
        model.addAttribute("titulo", "Mi Página Web :)");
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Gian");
        usuario.setApellidos("Paucar Cortez");
        usuario.setEmail("gianpc@gmail.com");
        model.addAttribute("usuario", usuario);
        return "perfil";
    }


}
