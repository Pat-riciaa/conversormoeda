package com.patricia.conversormoeda.model;

public class ConversaoResponse {
    private String moedaOrigem;
    private String moedaDestino;
    private double valorOriginal;
    private double valorConvertido;

    public ConversaoResponse(String moedaOrigem, String moedaDestino, double valorOriginal, double valorConvertido) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.valorOriginal = valorOriginal;
        this.valorConvertido = valorConvertido;
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }
}
