package com.team.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @ClassName PaymentService.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月14日 22:34:00
 * @Version 1.0
 * @History
 **/
@Service
public class PaymentService {
    //正常访问
    public String paymentInfo_OK(Integer id) {
        return "线程池：    " + Thread.currentThread().getName() + "    paymentInfo_OK,id:   " + id + "\t" + "====";
    }

    //错误访问
    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：    " + Thread.currentThread().getName() + "    paymentInfo_OK,id:   " + id + "\t" + "====";
    }

}
