package com.chenfangming.admin.core.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author fangming.chen
 * @since 2018-06-13 16：59
 * Email cfmmail@sina.com
 * Description Swagger配置
 */
@Configuration
@EnableSwagger2
@Slf4j
public class SwaggerConfig {
    /**
     * 基础路径
     */
    private static final String BASE_PACKAGE = "com.chenfangming.admin.controller";
    /**
     * 标题
     */
    private static final String TITLE = "Api文档";
    /**
     * 描述
     */
    private static final String DESCRIPTION = "描述";

    /**
     * 创建Api文档
     * @return Docket Docket
     */
    @Bean
    public Docket createApi() {
        log.info(">>开始初始化Swagger");
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
        log.info(">>初始化Swagger结束");
        return docket;
    }

    /**
     * 构建api信息
     * @return ApiInfo api信息
     */
    private ApiInfo apiInfo() {
        log.info(">>开始初始化ApiInfo");
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title(TITLE)
                .description(DESCRIPTION)
                .build();
        log.info(">>初始化ApiInfo结束");
        return apiInfo;
    }
}
