package com.example.restful.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by A on 2018-12-07 오후 5:50
 * restfulservicedemoinintellij / com.example.restful.config
 * No pain, No gain!
 * What :
 * Why :
 * How :
 * << 개정이력(Modification Information) >>
 * 수정일         수정자          수정내용
 * -------       --------       ---------------------------
 * 2018/04/01     김진국          최초 생성
 * 2017/05/27     이몽룡          인증이 필요없는 URL을 패스하는 로직 추가
 *
 * @author 개발팀 김진국
 * @version 1.0
 * @see
 * @since 2018/04/01
 */

@Configuration
@EnableSwagger2
@EnableWebMvc
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig extends WebMvcConfigurationSupport {
//    @Bean
//
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example.sample.controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(apiInfo());
//    }

//    private ApiInfo apiInfo() {
//        return new ApiInfo(
//                "Hello REST API",
//                "Some custom description of API.",
//                "API TOS",
//                "Terms of service",
//                new Contact("야훔", "www.example.com", "myeaddress@company.com"),
//                "License of API", "API license URL", Collections.emptyList());
//    }

}