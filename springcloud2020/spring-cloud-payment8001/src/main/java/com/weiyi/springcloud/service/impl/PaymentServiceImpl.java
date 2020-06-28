package com.weiyi.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.weiyi.springcloud.dao.IPaymentDao;
import com.weiyi.springcloud.model.PaymentModel;
import com.weiyi.springcloud.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentServiceImpl
 * @Description
 * @Author 16278
 * @Date 2020/6/15 10:54
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    IPaymentDao paymentDao;

    @Override
    public int create(PaymentModel paymentModel) {
        return 0;
        //paymentDao.create(paymentModel);
    }

    @Override
    public PaymentModel getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    //=====服务熔断
    @Override
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),// 失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id) {
        if (id < 0) {
            throw new RuntimeException("******id 不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName() + "\t" + "调用成功，流水号: " + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id) {
        return "id 不能负数，请稍后再试，/(ㄒoㄒ)/~~   id: " + id;
    }


}
