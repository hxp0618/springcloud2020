package com.team.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @ClassName PaymentFallbackService.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月19日 21:54:00
 * @Version 1.0
 * @History
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}

