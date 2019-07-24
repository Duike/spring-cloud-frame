package com.zile.servicebolg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
public class ServiceBolgApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBolgApplication.class, args);
    }





}
