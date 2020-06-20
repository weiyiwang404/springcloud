package com.weiyi.springcloud.controller;

import com.weiyi.springcloud.model.CommonResult;
import com.weiyi.springcloud.model.PaymentModel;
import com.weiyi.springcloud.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author 16278
 * @Date 2020/6/15 10:45
 * @Version 1.0
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @PostMapping("/create")
    public CommonResult create (@RequestBody PaymentModel paymentModel) {
        int result = paymentService.create(paymentModel);
        if (result > 0) {
            return new CommonResult(200, "success,port:" + serverPort, result);
        } else {
            return new CommonResult(400, "failed,port:" + serverPort, null);
        }
    }

    @GetMapping("get/{id}")
    public CommonResult getPaymentById (@PathVariable("id") Long id) {
        PaymentModel paymentModel = paymentService.getPaymentById(id);
        if (paymentModel != null) {
            return new CommonResult(200, "success,port:" + serverPort, paymentModel);
        } else {
            return new CommonResult(400, "failed,port:" + serverPort, null);
        }
    }

    @GetMapping("/timeout")
    public String timeOut () {
        try {
            TimeUnit.SECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

    @GetMapping("/lb")
    public String port(){
        return serverPort;
    }
}

