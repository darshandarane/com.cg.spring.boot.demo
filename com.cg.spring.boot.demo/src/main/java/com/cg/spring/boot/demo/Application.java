package com.cg.spring.boot.demo;

 
import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
 

@SpringBootApplication
public class Application {

 

    public static final Logger LOG = LoggerFactory.getLogger(Application.class);

 

    public static void main(String[] args) {

 

        LOG.info("Start");
        SpringApplication.run(Application.class, args);
        LOG.info("End");
    }

 

}