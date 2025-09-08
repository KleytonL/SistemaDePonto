package com.clt.sistemadeponto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PontoController {

    @GetMapping("/ponto")
    public String index() {
        return "Lista de ponto";
    }
}
