package com.team.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @ClassName ApplicationContextConfig.java
 * @Author HuangXuPing
 * @CreateTime 2020年03月26日 17:10:00
 * @Version 1.0
 * @History
 **/
@Configuration
public class ApplicationContextConfig {

    //使用 @LoadBalanced 注解赋予RestTemplate负载均衡的能力
    @Bean
    //使用自己的动态切换算法就需要把rabbin默认的轮询注解给注释
//    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
