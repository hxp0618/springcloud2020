package com.team.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description TODO
 * @ClassName PaymentMain8002.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月01日 12:10:00
 * @Version 1.0
 * @History
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}