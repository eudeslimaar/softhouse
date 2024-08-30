package com.eudeslima.softhouse;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title= "ERP Softhouse API", version = "1.0", description = "Documentação da API do ERP Softhouse"))
public class SofthouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofthouseApplication.class, args);
    }

}
