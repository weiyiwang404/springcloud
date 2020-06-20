package com.weiyi.springcloud.service;

import com.weiyi.springcloud.model.CommonResult;
import com.weiyi.springcloud.service.impl.OrderServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * description:
 *
 * @author weiyi
 * @date 2020/6/20 14:21
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE", fallback = OrderServiceImpl.class)
public interface OrderService {

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);


    @GetMapping("/payment/ok")
    public String ok();

    @GetMapping("/payment/timeout")
    public String timeout();
}
