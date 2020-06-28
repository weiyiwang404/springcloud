package com.weiyi.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderController
 * @Description
 * @Author 不如叫南安
 * @Date 2020/6/28 10:12
 * @Version 1.0
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @GetMapping("nacos/order/payment/{id}")
    private String getPayement (@PathVariable("id") Long id) {
        return restTemplate.getForObject(serverUrl + "/nacos/payment/" + id, String.class);
    }


}
