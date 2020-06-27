package com.weiyi.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author weiyi
 * @date 2020/6/24 23:37
 */
@RestController
@RefreshScope
public class ConfigClientController {


    @Value("${spring.config}")  // 配置文件的数据
    private String configInfo;

    @Value("${server.port}")
    private String port;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return port + "-----" + configInfo;
    }
}
