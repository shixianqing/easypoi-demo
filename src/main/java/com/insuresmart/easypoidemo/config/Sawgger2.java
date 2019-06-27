package com.insuresmart.easypoidemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Sawgger2 {

     @Bean
     public Docket createRestApi(){

         ParameterBuilder tokenPar = new ParameterBuilder();
         List<Parameter> pars = new ArrayList<Parameter>();
//         tokenPar.name("accesstoken").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
         pars.add(tokenPar.build());

           return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).
                  select().apis(RequestHandlerSelectors.any())
                  .paths(PathSelectors.any())
                  .build()
                  .globalOperationParameters(pars);
     }

     @Bean
      public ApiInfo apiInfo(){
         return new ApiInfoBuilder().title("easypoi-demo 接口文档").version("1.0").build();
     }
 }