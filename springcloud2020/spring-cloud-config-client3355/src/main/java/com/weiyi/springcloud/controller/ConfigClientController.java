package com.weiyi.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author weiyi
 * @date 2020/6/24 23:37
 */
@RestController
public class ConfigClientController {


    @Value("${master-springCloud-dev}")  // 配置文件的数据
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
