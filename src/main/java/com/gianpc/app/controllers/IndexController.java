package com.gianpc.app.controllers;

import com.gianpc.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

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
        /*usuario.setEmail("gianpc@gmail.com");*/
        model.addAttribute("usuario", usuario);
        return "perfil";
    }

    @GetMapping("/lista")
    public String lista( Model model){
        /*List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan", "De Arco", "juna@gmail.com"));
        usuarios.add(new Usuario("Diego", "Suarez", "diego@gmail.com"));
        usuarios.add(new Usuario("Lea", "Jimenez"));
        model.addAttribute("usuarios", usuarios);*/
        return "lista";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan", "De Arco", "juna@gmail.com"));
        usuarios.add(new Usuario("Diego", "Suarez", "diego@gmail.com"));
        usuarios.add(new Usuario("Lea", "Jimenez"));
        return usuarios;
    }
}
