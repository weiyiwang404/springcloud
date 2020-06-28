package com.weiyi.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigCenterController
 * @Description:
 * @Author wangwy
 * @Date 2020/6/28 15:24
 * @Version 1.0
 */
@RestController
@RefreshScope
public class ConfigCenterController {
    @Value("${config.info}")
    private String config;

    @RequestMapping("/nacos/config/get")
    public String get () {
        return config;
    }
}
