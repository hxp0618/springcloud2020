package com.team.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @ClassName FeignConfig.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月14日 22:02:00
 * @Version 1.0
 * @History
 **/
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignloggerLevel() {
        return Logger.Level.FULL;
    }

}
