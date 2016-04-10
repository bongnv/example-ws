package com.ankeoque.example.ws;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.DispatcherServlet;

/**
 * Created by ankeoque on 10/04/2016.
 */
@RestController
@Configuration
public class Application {
    private static final Logger LOG = LogManager.getLogger(Application.class);
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello world";
    }

    @Bean
    public DispatcherServlet dispatcherServlet() {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        return dispatcherServlet;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
        LOG.info("Initializing ServletRegistrationBean");
        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet,"/*");
        return registration;
    }

    @Bean
    public EmbeddedServletContainerFactory getEmbeddedServletContainerFactory() {
        LOG.info("Initializing EmbeddedServletContainerFactory");
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory("",8001);
        return factory;
    }
}
