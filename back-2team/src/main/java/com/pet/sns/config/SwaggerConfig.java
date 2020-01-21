package com.pet.sns.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;

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
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
        		.apiInfo(info()) // 스웨거에 표시할 정보
        		.select()
                .apis(RequestHandlerSelectors.
                        basePackage("com.web.curation.controller.account"))
                //apis package는 controller 위치
                .paths(PathSelectors.ant("/account/**"))
                //path : Controller에 @PostMapping("/account/**")이라고 되어있으닊깐
                .build();
    }
    
    private ApiInfo info() {	//스웨거 인포메이션
		return new ApiInfoBuilder()
				.title("공통프로젝트 Management API")
				.description("2번 프로젝트 관리")
				.license("SSAFY License")
				.version("2.0")
				.build();
	}

}


