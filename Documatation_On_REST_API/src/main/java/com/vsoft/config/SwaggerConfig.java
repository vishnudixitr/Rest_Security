package com.vsoft.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {


    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.vsoft"))
                .paths(regex("/rest.*"))
                .build()
                .apiInfo(metaInfo());
    }

    String result = "cat" + System.lineSeparator() + "dog";
    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Documatation on Rest API",
                "There are 3 API:GET POST and PUT",
                "1.0",
                "Terms of Service",
                new Contact("Vishnu dixit", "http://www.vsoft.co.in",
                        "vishnu.dixit@vsoftcorp.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html"
        );

        return apiInfo;
    }
}
