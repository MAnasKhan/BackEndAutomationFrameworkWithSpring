package com.nisum.onestopshop.be.runner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nisum.onestopshop.be.utils.ConnectionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({
        @PropertySource("classpath:application.properties"),@PropertySource("classpath:endpoint.properties")})
@ComponentScan(basePackages = "com.nisum.onestopshop.be")
public class SpringConfiguration {

    /**
     * Property placeholder configurer needed to process @Value annotations
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

}
