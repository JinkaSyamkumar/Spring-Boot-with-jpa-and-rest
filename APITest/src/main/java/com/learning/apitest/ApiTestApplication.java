package com.learning.apitest;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ApiTestApplication {

//	@Bean
//	public Docket apiDocket(){
//		return new Docket(DocumentationType.SWAGGER_2).groupName("efeatureapi").select()
//				.apis(RequestHandlerSelectors.basePackage("com.learning.apitest.web")).paths(PathSelectors.any()).build()
//				.pathMapping("/efeatureapi").
//				apiInfo(new ApiInfo("Why Search when you can use API!!",
//						"REST API to search UPCs by combination of Brand, Product Description, Size and Unit","1.0.0",null,
//						new Contact("Jinka Syamkumar(662177), Lead By Joseph Panakkal Varghese() ", null, null),null,null,null));
///*		https://springfox.github.io/springfox/docs/current/#configuring-the-objectmapper
//*/
//	}
	
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("efeatureapi")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.learning.apitest.web"))
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/efeatureapi")
                .apiInfo(new ApiInfo("Why Search when you can use API!!",
						"REST API to search UPCs by combination of Brand, Product Description, Size and Unit","1.0.0",null,
                		new Contact("Jinka Syamkumar(662177), Lead By Joseph Panakkal Varghese() ", null, null), null,
                		null, new ArrayList<>()))
                ;
    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiTestApplication.class, args);
	}
}
