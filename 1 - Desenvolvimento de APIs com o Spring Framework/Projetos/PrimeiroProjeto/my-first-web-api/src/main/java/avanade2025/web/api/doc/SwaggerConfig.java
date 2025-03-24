package avanade2025.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API") // Título da API
                        .description("API exemplo de uso de Springboot REST API") // Descrição da API
                        .version("1.0") // Versão da API
                        .contact(new Contact()
                                .name("Seu nome") // Nome do contato
                                .url("http://www.seusite.com.br") // URL do contato
                                .email("voce@seusite.com.br")) // E-mail do contato
                        .license(new License()
                                .name("Licença - Sua Empresa") // Nome da licença
                                .url("http://www.seusite.com.br")) // URL da licença
                        .termsOfService("Termo de uso: Open Source")); // Termos de serviço
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public") // Nome do grupo
                .packagesToScan("avanade2025.web.api.controller") // Pacote a ser escaneado
                .build();
    }
}