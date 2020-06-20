package com.weiyi.springcloud.service.impl;

import com.weiyi.springcloud.dao.IPaymentDao;
import com.weiyi.springcloud.model.PaymentModel;
import com.weiyi.springcloud.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author 16278
 * @Date 2020/6/15 10:54
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    IPaymentDao paymentDao;

    @Override
    public int create (PaymentModel paymentModel) {
        return 0;
        //paymentDao.create(paymentModel);
    }

    @Override
    public PaymentModel getPaymentById (Long id) {
        return paymentDao.getPaymentById(id);
    }
}
