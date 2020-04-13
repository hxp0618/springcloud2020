package com.team.springcloud;

import com.team.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description TODO
 * @ClassName OrderMain80.java
 * @Author HuangXuPing
 * @CreateTime 2020年03月26日 16:57:00
 * @Version 1.0
 * @History
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-payment-service", configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
