# Conversor de Moedas

Este é um projeto simples de conversor de moedas feito com Spring Boot e Thymeleaf, consumindo a API ExchangeRate-API para fazer as conversões.

## Funcionalidades

- Converter valores entre moedas diferentes
- Interface web simples usando Thymeleaf

## Como rodar o projeto

### Pré-requisitos

- Java 17+ instalado
- Maven instalado
- IDE (VS Code, IntelliJ, etc.)

### Passos para executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/Pat-riciaa/conversormoeda.git
   cd conversormoeda

2. Compile o projeto (opcional, mas recomendado):

    mvn clean install

3. Rode a aplicação Spring Boot:

    mvn spring-boot:run

Ou rode o arquivo JAR gerado em target:
    
    java -jar target/conversormoeda-0.0.1-SNAPSHOT.jar

4. Abra seu navegador e acesse:

    http://localhost:8080
    
5. Use a página para converter moedas.

Sobre a API
Este projeto utiliza a ExchangeRate-API para obter as taxas de câmbio e fazer a conversão.

Contato
Se tiver dúvidas ou sugestões, pode me contatar pelo email: patricia.vyeyra@gmail.com