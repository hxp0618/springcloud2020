package com.team.springcloud.controller;

import com.team.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @ClassName PaymentController.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月14日 22:40:00
 * @Version 1.0
 * @History
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String payment_OK(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfo_OK(id);
        log.info("************result:    " + result);
        return result;
    }

    @GetMapping(value = "/payment/hystrix/TimeOut/{id}")
    public String payment_TimeOut(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("************result:    " + result);
        return result;
    }
}
