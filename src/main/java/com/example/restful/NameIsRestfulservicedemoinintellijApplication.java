package com.example.restful;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.WebApplicationInitializer;

@Configuration
@EnableAspectJAutoProxy
@SpringBootApplication(scanBasePackages = {"com.example.restful"})
public class NameIsRestfulservicedemoinintellijApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

    private static final Logger logger = LoggerFactory.getLogger(NameIsRestfulservicedemoinintellijApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(NameIsRestfulservicedemoinintellijApplication.class, args);
    }
}
