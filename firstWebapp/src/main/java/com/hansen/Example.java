package com.hansen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {
    final static Logger logger = LoggerFactory.getLogger(Example.class);
    @RequestMapping("/")
    String home() {

        for ( int i = 0; i < 15; i++)
            logger.debug("GOT HERE!!!!!!");

        return "Hello World!...I am HERE.";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
