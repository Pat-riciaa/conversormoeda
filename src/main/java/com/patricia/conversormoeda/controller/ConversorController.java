package com.patricia.conversormoeda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ConversorController {

    @GetMapping("/converter")
    public String converterMoeda(@RequestParam String de, @RequestParam String para, @RequestParam double valor) throws Exception {
        String apiKey = "0907fad68d108d9596e7d6c0";
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + de + "/" + para + "/" + valor;

        RestTemplate restTemplate = new RestTemplate();
        String resposta = restTemplate.getForObject(url, String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(resposta);

        if (root.path("result").asText().equals("success")) {
            double convertedValue = root.path("conversion_result").asDouble();
            return "Valor convertido: " + convertedValue;
        } else {
            return "Erro na conversão: " + root.path("error-type").asText();
        }
    }
}
