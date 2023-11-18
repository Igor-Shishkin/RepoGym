package com.example.springbootsecurity.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Security")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.springbootsecutiry"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot Security")
                .description("MySQL version")
                .version("0.0.1")
                .build();
    }@EventListener(ApplicationReadyEvent.class)
    public void displaySwaggerURL(){
        System.out.println("Swagger-UI url: http://localhost:8080/swagger-ui-index.html");

    }
}
