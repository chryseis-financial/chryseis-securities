package com.chryseis.securities.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: OpenApiConfig
 * Inside the package - com.chryseis.securities.config
 * Created Date: 5/20/2020
 * Created Time: 2:30 PM
 **/
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customConfiguration(){
        List<Server> serverList = new ArrayList<>();
        serverList.add(new Server().url("http://localhost:8080").description("Development Server"));
        serverList.add(new Server().url("http://qa.chryseis.com").description("QA Server"));
        serverList.add(new Server().url("http://prod.chryseis.com").description("Production Server"));
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Chryseis Financial Services API")
                        .description("API Documentation for Investor Management")
                        .version("1.0.0")
                        .contact(new Contact().email("vbalaji215@gmail.com").url("http://chryseis.com")))
                .servers(serverList);
    }
}
