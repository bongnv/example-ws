package com.ankeoque.example.ws.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ankeoque on 10/04/2016.
 */
@RestController
public class HelloController {
    private static final Logger LOG = LogManager.getLogger(HelloController.class);

    public HelloController() {
        LOG.info("Initializing HelloController");
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello world";
    }
}
