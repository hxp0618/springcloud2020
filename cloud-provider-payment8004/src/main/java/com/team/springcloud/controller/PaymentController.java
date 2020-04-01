package com.team.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description TODO
 * @ClassName PaymentController.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月01日 14:25:00
 * @Version 1.0
 * @History
 **/
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper：" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}