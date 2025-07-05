package com.example.ms_inventario_bs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@Configuration

public class SwaggerConfig {
    @Bean
    public OpenAPI apiInfo(){
        return new OpenAPI()
                   .info(new Info().title("API de inventario (ms-inventario-bs) - Perfulandia")
                                    .description("Microservicio que se encarga del la logica de negocios")
                                    .version("1.0.0"));
    }
    

}
