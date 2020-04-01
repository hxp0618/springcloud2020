package com.team.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description TODO
 * @ClassName PaymentMain8004.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月01日 14:24:00
 * @Version 1.0
 * @History
 **/
@SpringBootApplication
@EnableDiscoveryClient  //该注解用于想使用consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}