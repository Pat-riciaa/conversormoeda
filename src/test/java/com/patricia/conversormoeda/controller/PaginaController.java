package com.patricia.conversormoeda.controller;

import com.patricia.conversormoeda.model.ConversaoResponse;
import com.patricia.conversormoeda.model.ExchangeApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class PaginaController {

    @Value("${api.exchangerate.url}")
    private String apiUrl;

    @Value("${api.exchangerate.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public PaginaController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/")
    public String abrirPagina() {
        return "conversor"; // Vai buscar src/main/resources/templates/conversor.html
    }

    @PostMapping("/converter")
    public String converter(
            @RequestParam double valor,
            @RequestParam String moedaDestino,
            Model model) {

        String moedaOrigem = "BRL"; // fixa o real como origem

        String url = String.format("%s?from=%s&to=%s&amount=%f&apikey=%s", 
                apiUrl, moedaOrigem, moedaDestino, valor, apiKey);

        ExchangeApiResponse response = restTemplate.getForObject(url, ExchangeApiResponse.class);

        if (response != null && response.isSuccess()) {
            double convertido = response.getResult();
            model.addAttribute("resultado", String.format("R$ %.2f = %.2f %s", valor, convertido, moedaDestino));
        } else {
            model.addAttribute("resultado", "Erro na conversão.");
        }

        return "conversor"; // Retorna para a mesma página com o resultado
    }
}



