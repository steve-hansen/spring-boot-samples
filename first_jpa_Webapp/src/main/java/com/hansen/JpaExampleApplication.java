package com.hansen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication // equivalent to following three annotations
  //@EnableAutoConfiguration
  //@Configuration
  //@ComponentScan   -- scan for Entities
public class JpaExampleApplication {
    final static Logger logger = LoggerFactory.getLogger(JpaExampleApplication.class);

    public static void main(String[] args) throws Exception
    {
        logger.debug("APP STARTING!!!!!!");

        SpringApplication.run(JpaExampleApplication.class, args);
    }

}
