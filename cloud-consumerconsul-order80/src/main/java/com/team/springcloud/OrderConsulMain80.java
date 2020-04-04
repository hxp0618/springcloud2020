package com.team.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description TODO
 * @ClassName OrderConsulMain80.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月04日 21:51:00
 * @Version 1.0
 * @History
 **/
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class OrderConsulMain80
{
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class, args);
    }
}

