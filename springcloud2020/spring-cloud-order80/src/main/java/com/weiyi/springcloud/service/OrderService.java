package com.weiyi.springcloud.service;

import com.weiyi.springcloud.model.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * description:
 *
 * @author weiyi
 * @date 2020/6/20 14:21
 */
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface OrderService {

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById (@PathVariable("id") Long id);
}
