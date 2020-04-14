package com.team.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description TODO
 * @ClassName OrderFeignMain80.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月14日 21:26:00
 * @Version 1.0
 * @History
 **/
@SpringCloudApplication
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
