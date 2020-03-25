package com.gbk;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * The Class SwaggerConfiguration.
 *
 * @author TCS
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    /** The header. */
    private static final String HEADER = "header";

    /** The string. */
    private static final String STRING = "string";

    /**
     * The method to Api.
     *
     * @return the docket
     */
    @Bean
    public Docket internalApiDocket() {
        List<Parameter> internalAPI = new ArrayList<>();
        ParameterBuilder params = new ParameterBuilder();

        internalAPI.add(params.name("requestId").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(true).build());

        internalAPI.add(params.name("sessionId").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(true).build());

        internalAPI.add(params.name("channelCode").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(true).build());

        internalAPI.add(params.name("userName").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(true).build());

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.regex("/InputProcessor.*"))
                .build().pathMapping("/")
                .apiInfo(internalApiInfo())
                .groupName("InputProcessor")
                .useDefaultResponseMessages(false)
                .globalOperationParameters(internalAPI);
    }

    /**
     * The method to Api info.
     *
     * @return the api info
     */
    @Bean
    public ApiInfo internalApiInfo() {
        final ApiInfoBuilder builder = new ApiInfoBuilder()
                .title("INPUT PROCESSOR through Swagger UI")
                .version("1.0")
                .license("(C) Copyright Test")
                .description("List of all the APIs of IN PUT PROCESSOR App through Swagger UI");
        return builder.build();
    }

    /**
     * The method to Api info.
     *
     * @return the api info
     */
    @Bean
    public ApiInfo apificationInfo() {
        final ApiInfoBuilder builder = new ApiInfoBuilder()
                .title("GBK Corporate Services through Swagger UI")
                .version("1.0")
                .license("(C) Copyright Test")
                .description("List of all the APIs of Corporate Bulk Processing API through Swagger UI");
        return builder.build();
    }
}
