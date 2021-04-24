package com.joshua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);

    }

//    将RestTemplate添加到ioc容器
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
