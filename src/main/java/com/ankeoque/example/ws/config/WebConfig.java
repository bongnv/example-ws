package com.ankeoque.example.ws.config;

import com.ankeoque.example.ws.controller.HelloController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ankeoque on 10/04/2016.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    HelloController helloController() {
        return new HelloController();
    }
}
