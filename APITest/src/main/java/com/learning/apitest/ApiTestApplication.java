package com.learning.apitest;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.learning.apitest.config.BasicAuthenticationPoint;

import springfox.documentation.builders.AuthorizationCodeGrantBuilder;
import springfox.documentation.builders.OAuthBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.BasicAuth;
import springfox.documentation.service.Contact;
import springfox.documentation.service.GrantType;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.service.TokenEndpoint;
import springfox.documentation.service.TokenRequestEndpoint;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebSecurity
public class ApiTestApplication extends WebSecurityConfigurerAdapter {

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

// basic authentication http://www.springboottutorial.com/securing-rest-services-with-spring-boot-starter-security
	
//	https://gigsterous.github.io/engineering/2017/03/01/spring-boot-4.html
//  http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
	
	 @Autowired  
	   private BasicAuthenticationPoint basicAuthenticationPoint;

	 
    @Bean
    public Docket api() {
    	List<SecurityScheme> schemeList = new ArrayList<>();
		schemeList.add(new BasicAuth("basicAuth"));
		return new Docket(DocumentationType.SWAGGER_2).groupName("efeatureapi")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.learning.apitest.web"))
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .securitySchemes(schemeList)
                .apiInfo(new ApiInfo("Why Search when you can use API!!",
						"REST APIs to search UPCs by combination of Brand, Product Description, Size and Unit","1.0.0",null,
                		new Contact("Jinka Syamkumar(662177), Lead By Joseph Panakkal Varghese() ", null, null), null,
                		null, new ArrayList<>()))
                ;
    }
    
    

    
    private static final String[] AUTH_WHITELIST = {

            // -- swagger ui
            "/swagger-resources/**",
            "/swagger-ui.html",
            "/v2/api-docs",
            "/webjars/**"
    };
 

    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable();
            http.authorizeRequests().antMatchers(AUTH_WHITELIST).permitAll()
//            .antMatchers("/refapi/*").denyAll();
            .anyRequest().authenticated();
            http.httpBasic().authenticationEntryPoint(basicAuthenticationPoint);
    }
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("api").password("api").roles("ADMIN");
    }
	public static void main(String[] args) {
	
		SpringApplication.run(ApiTestApplication.class, args);
	}
}
