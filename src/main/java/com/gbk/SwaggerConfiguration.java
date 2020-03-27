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

    @Bean
    public ApiInfo beneficiaryApiInfo() {
        final ApiInfoBuilder builder = new ApiInfoBuilder()
                .title("Payment Initiation API definitions through Swagger UI")
                .version("1.0")
                .license("(C) Copyright Test")
                .description("List of beneficiary APIs");
        return builder.build();
    }

    @Bean
    public Docket beneficiaryApiDocket() {
        List<Parameter> internalAPI = new ArrayList<>();
        ParameterBuilder params = new ParameterBuilder();

        internalAPI.add(params.name("x-fapi-interaction-id").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(true).description("Interaction Id").build());

        internalAPI.add(params.name("x-fapi-session-id").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(true).description("Session Id").build());

        internalAPI.add(params.name("customer-no").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(true).description("Customer Number").build());

        internalAPI.add(params.name("channel").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(true).description("Channel").build());

        internalAPI.add(params.name("x-fapi-user-id").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(false).description("User Id").build());

        internalAPI.add(params.name("x-fapi-user-role").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(false).description("User Role").build());

        internalAPI.add(params.name("authorization-token").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(false).description("Authorization Token").build());

        internalAPI.add(params.name("x-fapi-customer-ip-address").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(false).description("IP Address of the client").build());

        internalAPI.add(params.name("idempotency-Key").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(false).description("Idempotency Key").build());

        internalAPI.add(params.name("jwt-Token").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(false).description("JWT Token").build());

        internalAPI.add(params.name("content-language").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(false).description("Content language").build());

        internalAPI.add(params.name("content-type").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(false).description("Content type").build());

        internalAPI.add(params.name("accept").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(false).description("Accept Type").build());

        internalAPI.add(params.name("x-fapi-customer-last-logged-time").modelRef(new ModelRef(STRING)).parameterType(HEADER).required(false).description("Last logged time of the client").build());

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.regex("/v1/payment-initiation.*"))
                .build().pathMapping("/")
                .apiInfo(beneficiaryApiInfo())
                .groupName("paymentInitiation")
                .useDefaultResponseMessages(false)
                .globalOperationParameters(internalAPI);
    }
}
