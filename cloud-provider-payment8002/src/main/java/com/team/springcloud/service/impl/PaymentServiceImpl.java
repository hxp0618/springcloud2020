package com.team.springcloud.service.impl;

import com.team.springcloud.dao.PaymentDao;
import com.team.springcloud.entities.Payment;
import com.team.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @ClassName PaymentServiceImpl.java
 * @Author HuangXuPing
 * @CreateTime 2020年03月26日 17:42:00
 * @Version 1.0
 * @History
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    /**
     * 新增
     *
     * @param payment
     * @return
     */
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}