package com.weiyi.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PaymentController
 * @Description
 * @Author 不如叫南安
 * @Date 2020/6/28 9:57
 * @Version 1.0
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("nacos/payment/{id}")
    public String getPayment (@PathVariable("id") Long id) {
        return "paymnet service,port:" + port + "\t id:" + id;
    }
}
