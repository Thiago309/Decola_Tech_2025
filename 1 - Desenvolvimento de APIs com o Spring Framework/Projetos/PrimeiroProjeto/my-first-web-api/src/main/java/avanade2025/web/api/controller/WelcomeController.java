package avanade2025.web.api.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;


/* @RestController = Um controller é um recurso que disponibiliza as funcionalidades de negócio da aplicação atraves
do protocolo HTTP. Ou seja, obtem da aplicação toda logica de negocio. Esse serviço funciona de
forma local, mas agora quero disponibilizar pra internet atraves de uma API. */
@SpringBootApplication
@RestController
@RequestMapping("/api")
@Tag(name = "Welcome", description = "API de boas-vindas") // Tag para agrupar endpoints
public class WelcomeController {
    @GetMapping("/welcome")
    @Operation(summary = "Retorna uma mensagem de boas-vindas", description = "Este endpoint retorna uma mensagem simples.")
    @ApiResponse(responseCode = "200", description = "Mensagem retornada com sucesso")
    public String welcome() {
        return "Welcome to My Spring Boot Web API";
    }
}