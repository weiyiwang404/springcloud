package com.weiyi.springcloud.controller;

import com.weiyi.springcloud.model.CommonResult;
import com.weiyi.springcloud.model.PaymentModel;
import com.weiyi.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * description:
 *
 * @author weiyi
 * @date 2020/6/20 12:21
 */
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    // private static final String PAYMENT_URL = "http://localhost:8001";
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/order/payment/get/{id}")
    public CommonResult<PaymentModel> getById(@PathVariable("id") Long id) {
        return orderService.getPaymentById(id);
    }

    @GetMapping("order/payment/ok")
    public String ok(){
        return orderService.ok();
    }

    @GetMapping("order/payment/timeout")
    public String timeout(){
        return orderService.timeout();
    }

}
