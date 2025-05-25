package com.patricia.conversormoeda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/")
    public String abrirPaginaConversor() {
        return "conversor";  // nome do arquivo HTML sem extensão
    }
}

