package com.team.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @ClassName MySelfRule.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月13日 21:08:00
 * @Version 1.0
 * @History
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
