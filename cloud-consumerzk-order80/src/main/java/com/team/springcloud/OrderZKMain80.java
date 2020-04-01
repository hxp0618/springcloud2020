package com.team.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description TODO
 * @ClassName OrderZKMain80.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月01日 15:16:00
 * @Version 1.0
 * @History
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain80.class,args);
    }
}