package com.team.springcloud.controller;

import com.team.springcloud.entities.CommonResult;
import com.team.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @ClassName OrderController.java
 * @Author HuangXuPing
 * @CreateTime 2020年03月26日 16:59:00
 * @Version 1.0
 * @History
 **/
@RestController
@Slf4j
public class OrderController {
    public static final String Payment_url = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {

        return restTemplate.postForObject(Payment_url + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(Payment_url + "/payment/get/" + id, CommonResult.class);
    }
}
