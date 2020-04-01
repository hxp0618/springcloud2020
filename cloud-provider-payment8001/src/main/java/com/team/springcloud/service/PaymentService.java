package com.team.springcloud.service;

import com.team.springcloud.entities.Payment;

public interface PaymentService {
    /**
     * 新增
     *
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    public Payment getPaymentById(Long id);
}
