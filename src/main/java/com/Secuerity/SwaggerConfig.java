//package com.Secuerity;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//
//import com.google.common.base.Predicate;
//
//import springfox.documentation.RequestHandler;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
//public class SwaggerConfig {
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis((Predicate<RequestHandler>) RequestHandlerSelectors.basePackage("ccom.Secuerity")) // Change to your base package
//                .paths((Predicate<String>) PathSelectors.any())
//                .build();
//    }
//    
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests()
//            .antMatchers("/swagger-ui/**", "/v2/api-docs", "/swagger-resources/**").permitAll() // Allow access to Swagger UI
//            .anyRequest().authenticated();
//    }
//
//}
