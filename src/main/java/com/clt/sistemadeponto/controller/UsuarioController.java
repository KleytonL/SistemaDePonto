package com.clt.sistemadeponto.controller;

import com.clt.sistemadeponto.entity.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @GetMapping("/usuarios")
    public String getUsuarios() {
        return "Lista de usuarios";
    }

}
