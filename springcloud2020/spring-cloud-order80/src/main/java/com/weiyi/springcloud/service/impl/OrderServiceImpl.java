package com.weiyi.springcloud.service.impl;

import com.weiyi.springcloud.model.CommonResult;
import com.weiyi.springcloud.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * description:
 *
 * @author weiyi
 * @date 2020/6/20 16:45
 */
@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public CommonResult getPaymentById(Long id) {
        return null;
    }

    @Override
    public String ok() {
        return "服务器异常，请稍后再试！";
    }

    @Override
    public String timeout() {
        return "服务器异常，请稍后再试！";
    }
}
