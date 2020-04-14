package com.team.springcloud.controller;

import com.team.springcloud.entities.CommonResult;
import com.team.springcloud.entities.Payment;
import com.team.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @ClassName OrderFeignController.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月14日 21:36:00
 * @Version 1.0
 * @History
 **/
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        //Openfeign-ribbon,客户端默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }

}
