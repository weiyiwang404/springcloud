package com.weiyi.springcloud.service;

import com.weiyi.springcloud.model.PaymentModel;

/**
 * @ClassName IPaymentService
 * @Description
 * @Author 16278
 * @Date 2020/6/15 10:54
 * @Version 1.0
 */
public interface IPaymentService {

    int create(PaymentModel paymentModel);

    PaymentModel getPaymentById(Long id);

    public String paymentCircuitBreaker(Integer id);

}
