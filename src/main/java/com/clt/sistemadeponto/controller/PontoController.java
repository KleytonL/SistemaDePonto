package com.clt.sistemadeponto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PontoController {

    @GetMapping("/")
    public String index() {
        return "Atumalaka";
    }
}
