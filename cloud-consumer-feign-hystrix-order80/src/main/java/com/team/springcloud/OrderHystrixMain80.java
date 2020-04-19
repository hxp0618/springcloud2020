package com.team.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description TODO
 * @ClassName OrderHystrixMain80.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月19日 21:49:00
 * @Version 1.0
 * @History
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
    }
}
