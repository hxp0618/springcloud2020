package com.team.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description TODO
 * @ClassName PaymentController.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月04日 21:22:00
 * @Version 1.0
 * @History
 **/
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    /**
     * http://localhost:8006/payment/zk
     *
     * @return
     */
    @RequestMapping(value = "payment/consul")
    public String paymentZk() {
        return "SpringCloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
