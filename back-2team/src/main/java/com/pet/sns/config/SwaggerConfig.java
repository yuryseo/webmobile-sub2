package com.pet.sns.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	@Bean
	public Docket api() {		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("PetSNS Management")	// select a spec
				.apiInfo(info())
				.select()//Initiates a builder for api selection.
				.apis(RequestHandlerSelectors.basePackage("com.pet.sns.controller"))
				//.paths(PathSelectors.any())
				.paths(PathSelectors.ant("/**"))
				.build();
		
	}

	private ApiInfo info() {
		return new ApiInfoBuilder().title("PetSNS Management API")
				.description("<h1>PetSNS Management</h1>")
				.license("ssafy")
				.version("2.0")
				.build();
	}
}
